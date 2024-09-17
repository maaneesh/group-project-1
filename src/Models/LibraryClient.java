package models;

import java.util.Scanner;

public class LibraryClient {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\tWelcome to the Library App!");
       UserServiceImp userOptions = new UserServiceImp();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Please select an option:");
            System.out.println("- ".repeat(45));
            System.out.println("\t\t1. Register User\t\t2.Sign In \t\t3.Logout user\t\t 4. Exit");
            System.out.println("- ".repeat(45));
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    userOptions.registerUser();
                    break;
                case 2:
                    userOptions.viewUsers();
                    break;
                case 3:
                    userOptions.logoutUser();
                    break;
                case 4:
                    System.out.println("Thank you for using Library App!");
                    flag = false;
                    break;


            }

        }
    }
}
