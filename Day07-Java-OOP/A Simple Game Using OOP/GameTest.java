package com.yde.test2;

public class GameTest {
    public static void main(String[] args) {
        //1. To create our 1st role
        Role r1 = new Role("Jordan", 100, 'M');
        //2. To create our 2nd role
        Role r2 = new Role("Carlos", 100, 'M');

        //display role's info
        r1.showRoleInfo();
        r2.showRoleInfo();

        //3. Fight begin
        while(true){
            r1.attack(r2);
            // To check r2's remain HP
            if(r2.getHp() == 0){
                System.out.println(r1.getName() + " won!");
                break;
            }

            r2.attack(r1);
            // To check r1's remain HP
            if (r1.getHp() == 0){
                System.out.println(r2.getName()+ " won!");
                break;
            }

        }
    }
}
