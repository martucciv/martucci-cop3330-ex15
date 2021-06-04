package ex15;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Password {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Password app = new Password();
        String correctPass = "abc$123";

        String password = app.inputPassword();
        app.printOutput(password, correctPass);
    }

    public String inputPassword(){
        System.out.print("What is the password? ");
        return input.nextLine();
    }

    public void printOutput(String password, String correctPass){
        if(password.equals(correctPass)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
