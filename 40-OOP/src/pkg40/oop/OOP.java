/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40.oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aqira
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instansiasi
        Person firstPerson = new Person();
        Person secondPerson = new Person("Andre", "MALE", 22, 190, 100);

        String name = "Aqira";
        firstPerson.setName(name);
        String firstName = firstPerson.getName();
        //Aqira
        System.out.println("Nama orang pertama adalah: "
                + firstName);
        //Ubah jadi Aqira Kelana
        firstPerson.setName(firstName + " Kelana");
        String fullName = firstPerson.getName();
        //Aqira + Aqira Kelana
        System.out.println("Nama depan: " + firstName);
        System.out.println("Nama panjang: " + fullName);
        System.out.println(firstPerson.toString());
        System.out.println(secondPerson);

        List<String> exampleOfList = new ArrayList<>();

        Cyborg firstCyborg = new Cyborg();
        System.out.println(firstCyborg);

        try {
            RemoteImpl remoteSamsung = new RemoteImpl();
            int number = 2;
            boolean powerStatus = remoteSamsung.power(true);
            String channel = remoteSamsung.channel(number);
            System.out.println("Power is : " + powerStatus);
            System.out.println("Channel number: " + number + "Shows: " + channel);
            System.out.println(remoteSamsung.source(""));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

}
