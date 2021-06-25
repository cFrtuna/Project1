package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Email mail1 = new Email("misa", "urm");
        mail1.setPassword("my password");
        System.out.println(mail1.toString());

        StaffEmail staffEmail = new StaffEmail("cristy","blabbla");
        staffEmail.setPassword("crsty password");
        System.out.println(staffEmail.toString());



    }
}
