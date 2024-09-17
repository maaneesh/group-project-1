package models;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImp implements UserInterface {

    ArrayList<User> usersList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void registerUser() {
        System.out.println("Register user");
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        usersList.add(new User(username, password, email));

    }
    public void authenticateUser(User user) {
        for (User u : usersList) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                System.out.println("You have successfully logged in!");
            }
        }
    }

    public void viewUsers(){
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    @Override
    public void loginUser(User user) {
        System.out.println("Login user");

    }

    @Override
    public void logoutUser() {
        System.out.println("Logout user");

    }


}
