/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40.oop;

/**
 *
 * @author aqira
 */
public class Person {

    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;

    //Overloading part 1
    public Person() {
        setGender("unknown");
    }

    //Overloading part 2
    public Person(String name, String gender, int age, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return this.name;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Polymorphism + Overriding
    @Override
    public String toString() {
        return "Name: " + this.name
                + "|Gender: " + this.gender
                + "| Age: " + this.age
                + "| Height: " + this.height
                + "| Weight: " + this.weight;
    }

}
