package com.julia.classes;

/**
 * Created by Julia on 4/12/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private Hobbies hobby;

    public Person(){}

    public Person(String firstName, String lastName, int age, Gender gender, Hobbies hobby) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Hobbies getHobby() {
        return hobby;
    }

    public void setHobby(Hobbies hobby) {
        this.hobby = hobby;
    }
}
