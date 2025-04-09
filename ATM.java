/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.bank;

/**
 *
 * @author Swetha
 */

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account swetha = new Account("AC001", "Swetha", 10000);
        Account dhiviyasree = new Account("AC002", "Dhiviyasree", 7500);
        Account vijayalaxshmi = new Account("AC003", "Vijayalakshmi", 5000);

        Account active = null;

        System.out.println("Welcome to VIT ATM System");
        System.out.println("Select your account:");
        System.out.println("1. Swetha");
        System.out.println("2. Dhiviyasree");
        System.out.println("3. Vijayalaxshmi");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: active = swetha; break;
            case 2: active = dhiviyasree; break;
            case 3: active = vijayalaxshmi; break;
            default:
                System.out.println("Invalid user selected.");
                return;
        }

        System.out.println("\nLogged in as: " + active.getHolderName());

        boolean continueSession = true;
        while (continueSession) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Balance: ₹" + active.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    active.addFunds(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    active.withdrawFunds(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Session ended. Thank you!");
                    continueSession = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
