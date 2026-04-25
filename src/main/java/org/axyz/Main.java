package org.axyz;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        printBanner();

        do {
            printMainMenu();
            String line = input.nextLine().trim();
            switch (line) {
                case "1" -> handleRegister(input);
                case "2" -> handleLogin(input);
                case "3" -> {
                    System.out.println("See you next time! ヾ(￣▽￣) Bye~Bye~");
                    isRunning = false;
                }
                default -> System.out.println("Invalid input!, please try again");
            }

        }while (isRunning) ;
        input.close();


    }
    private static void printBanner () {
        System.out.println("""
                    ===========================
                    |  axyz - project manager |
                    ===========================
                    """);
    }
    private static void printMainMenu () {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Quit");
        System.out.println("Please choose an option:");
    }
    private static void handleRegister(Scanner input) {
        System.out.println("Enter your username:");
        String username = input.nextLine().trim();
        System.out.println("Enter your password:");
        String password = input.nextLine().trim();
        System.out.println("Registered your username: " + username);
    }
    private static void handleLogin(Scanner input) {
        printBanner();
        System.out.println("Enter your username: ");
        String username = input.nextLine().trim();
        System.out.println("Enter your password: ");
        String password = input.nextLine().trim();

        System.out.println("Logged in successful!");
        boolean isLoggedin = true;

        do {
            printDashboardMenu();
            String choice = input.nextLine().trim();



        }while (isLoggedin);


    }
    private static void printDashboardMenu(){
        System.out.println("===Dashboard===");
        System.out.println("1. My projects");
        System.out.println("2. My tasks");
        System.out.println("3. Reports");
        System.out.println("4. Quit");
        System.out.println("Please choose an option:");
    }
}
