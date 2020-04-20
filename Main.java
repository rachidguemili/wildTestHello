package com.company;

//  MAIN class used to present himself
//  and to register a new student in a file

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String first, second;
        String line ;
        int age;
// we ask a wilder to give his name and first name and his age
        WilderPlus rachidG = new WilderPlus("Rachid", "Guemili", 43);
        System.out.println(rachidG.sayHello());
        System.out.println(rachidG.howOldAreYou());
// we ask next student to register him he gives us his first and last name and his age
// and we save it in a file called student

// we can put here a loop to register several students
        while (true) {
            System.out.println("NEXT PLEASE !");
            WilderPlus newWilder = new WilderPlus();
            System.out.println("Your First Name !");
            try {
                Scanner sc = new Scanner(System.in);
                line = sc.nextLine();
                if(line.equals("end") | line.equals("END"))
                    break;
                first = line;
                System.out.println("Your Last Name !");
                sc = new Scanner(System.in);
                line = sc.nextLine();
                if(line.equals("end") | line.equals("END"))
                    break;
                second = line;
                System.out.println("Your age !");
                // verifying if the input is a number
                while (true) {
                    try {
                        sc = new Scanner(System.in);
                        line = sc.nextLine();
                        if(line.equals("end") | line.equals("END"))
                            break;
                        Integer.parseInt(line);
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("Please make sure to enter a valid number for your age");
                       }
                }
                if(line.equals("end") | line.equals("END"))
                    break;

                age = Integer.parseInt(line);
                newWilder.registerWilder(first, second, age);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




