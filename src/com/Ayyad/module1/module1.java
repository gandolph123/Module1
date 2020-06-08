package com.Ayyad.module1;

import java.util.Scanner;

public class module1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX = 10;
        String[] list = new String[MAX];
        int choice = 0;

        while (choice != 3) {
            System.out.println();
            System.out.println("If you want to add to your to-do list, press 1.");
            System.out.println("If you want to print, press 2.");
            System.out.println("If you want to exit the program, press 3.");
            System.out.print("Select an option: ");
            choice = input.nextInt();
            String userEnteredItem;
            int count = 0;
            if (choice == 1) {
                System.out.println("Hit enter after to do's, if you want to stop, type 'stop'.");
                for (int i = 0; i < MAX; i++) {
                    userEnteredItem = input.nextLine();
                    if (!userEnteredItem.isEmpty()) {
                        list[i] = userEnteredItem;
                        if (userEnteredItem.equals("stop")) {
                            break;
                        }
                        count++;
                    } else {
                        i--; // Do not increase index for empty item.
                    }
                }
            } else if (choice == 2) {
                for (int index = 0; index < count; index++) {
                    System.out.println(list[index]);
                }
            } else {
                input.close();
            }
        }
    }
}

