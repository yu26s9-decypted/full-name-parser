package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        String askName = askString("What is your full name?");
        System.out.println(parseName(askName));
    }

    public static String askString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    public static String parseName(String name){
        String firstName;
        String middleName;
        String lastName;
        String[] names = name.split("\\s");

        if (names.length == 3){
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
            String formattedFirstName = "First name: " + firstName;
            String formattedMiddleName = "Middle Name: " + middleName;
            String formattedLastName = "Last name: " + lastName;
            String output = formattedFirstName + "\n" + formattedMiddleName + "\n"+ formattedLastName;
            return output;

        } else {
            firstName = names[0];
            lastName = names[1];
            String formattedFirstName = "First name: " + firstName;
            String formattedLastName = "Last name: " + lastName;
            String output = formattedFirstName + "\n" + formattedLastName + "\n";
            return output;
        }

    }



}
