package com.yde.test2;

import java.util.Random;

/**
 * create a role with name and HP and attack method so that they can fight(not a real fight)
 */
public class Role {
    private String name;
    private int hp;
    private char gender;
    private String face;

    String[] boyfaces= {"charming and elegant",
            "handsome and dignified",
            "good-looking",
            "well-featured",
            "average-looking",
            "plain-looking",
            "hideous-looking"};
    String[] girlfaces ={"stunningly beautiful",
            "as beautiful as a goddess",
            "graceful and elegant",
            "slim and attractive",
            "average-looking",
            "plain-looking",
            "unbearably ugly"};

    // attack descriptions
    String[] attacks_desc = {
            "%s performs the move [Vest Nail], swiftly circling behind %s and striking a deadly palm toward the Ling Tai point on the back.",
            "%s launches [Sky-Seeking Claw], leaping into the air and transforming a palm strike into a fierce grab toward %s.",
            "%s lets out a loud shout, crouches low, and uses [Thunder Strike], punching hard at %s’s legs.",
            "%s channels energy into the palm, turning it blood-red in an instant. With [Thunder Palm], they push it fiercely toward %s.",
            "%s flips the left hand up and follows with the right, executing [Unstoppable Fist], landing a solid blow on %s.",
            "%s steps forward aggressively, chaining moves together in [Linked Hanging Strikes], launching a series of attacks at %s."
    };

    // injured descriptions
    String[] injureds_desc = {
            "As a result, %s merely takes half a step back, completely unharmed.",
            "As a result, %s suffers a minor bruise.",
            "The strike lands cleanly — %s bends over in pain.",
            "%s lets out a muffled groan, clearly suffering some internal injury.",
            "%s staggers and falls to the ground.",
            "%s’s face turns pale, stumbling back several steps.",
            "With a loud 'boom', %s spits out a mouthful of blood.",
            "%s screams in agony and collapses like a heap of mud."
    };

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        //The way they look are random
        Random r = new Random();

        if(gender == 'M'){
           int index = r.nextInt(boyfaces.length);
           this.face = boyfaces[index];
        }else if(gender == 'F'){
           int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];

        }else{
            this.face = "ugly";
        }

        return face;
    }

    public void setFace(char gender) {
        this.face = face;
    }

    public Role() {
    }

    public Role(String name, int hp, char gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //create a method for attack
    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];

        //output an attack effect
        System.out.printf(KungFu, this.getName(), role.getName());
        System.out.println();
        // calculate the damage they caused from 1 ~ 20
        int damage = r.nextInt(20) + 1;

        // Calculate the remain HP for the role who was attacked
        int remainHP = role.getHp() - damage;
        // Tell if the remain blood < 0 or not, if it is then = 0, otherwise keep the remainHP
        remainHP = remainHP < 0 ? 0 : remainHP;
        // change the role's HP who was attacked
        role.setHp(remainHP);

        //injured description
        // if your remain HP > 90, use index 0
        // HP: 80 ~ 90 use 1
        // HP: 70 ~ 80 use 2
        // HP: 60 ~ 70 use 3
        // HP: 40 ~ 60 use 4
        // HP: 20 ~ 40 use 5
        // HP: 10 ~ 20 use 6
        // HP: < 10 use 7
        if(remainHP > 90){
            System.out.printf(injureds_desc[0], role.getName());
        }else if(remainHP > 80 && remainHP <= 90){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(remainHP > 70 && remainHP <= 80){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(remainHP > 60 && remainHP <= 70){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(remainHP > 40 && remainHP <= 60){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(remainHP > 20 && remainHP <= 40){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(remainHP > 10 && remainHP <= 20){
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
    }

    public void showRoleInfo(){
        System.out.println("Name: " + getName());
        System.out.println("HP: " + getHp());
        System.out.println("Gender: " + getGender());
        System.out.println("Face: " + getFace());
    }
}
