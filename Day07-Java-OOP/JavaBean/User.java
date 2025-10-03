package com.yde.javaBean;

/**
 * I learned how to create a standard JavaBean class
 * And I can also use short cut: alt + insert to create.
 */
public class User {
    //Field
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //Constructor without parameters
    public User(){}

    //Constructor with parameters
    public User(String username, String password, String email, String gender, int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }

    //getter and setter
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
