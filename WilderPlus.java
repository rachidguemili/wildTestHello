package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WilderPlus
{
    private String firstName ="wilderFirst";
    private String lastName ="wilderLast";
    private int age = 18;

    // arguments are passed using the text field below this editor
    public WilderPlus(){
    }
    public WilderPlus(String firstName,String secondName,int age)
    {
        this.firstName = firstName;
        lastName=secondName;
        this.age=age;
    }

    public String sayHello()
    {

        String message = "Hello my name is "+    firstName +" "+ lastName;
        return message;
    }
    public String howOldAreYou()
    {
        return "I am "+ age +" years old." ;
    }

    public void registerWilder(String first, String last, int age) {
        firstName = first;
        lastName = last;
        this.age = age;
        String student = firstName + "  " + lastName + "  " + age + " years old\n";

        // register in a file
        File file = new File("student.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("fichier créé =====");
            } catch (Exception e) {
                System.out.println("Erreur creation fichier   =====");
                e.printStackTrace();
            }
        }

        try {
//            FileWriter writer = new FileWriter(new FileOutputStream(file),true);
            FileWriter writer = new FileWriter(file,true);
                writer.write(student);
                System.out.println("MAJ  fichier ====");
                writer.close();
        } catch (Exception e) {
            System.out.println("erreur ecriture   cree =====");

            e.printStackTrace();
        }
    }
}
