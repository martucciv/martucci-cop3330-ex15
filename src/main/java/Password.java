import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        String correctPass = "abc$123";

        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = input.next();

        if(password.equals(correctPass)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
