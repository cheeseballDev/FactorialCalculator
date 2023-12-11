package javaActivities;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // INIT VAR
        int userNumber, y = 0, i;
        Scanner userInput = new Scanner(System.in);
        System.out.println("<------ Factorial Calculator ------>");
        while (y != 5) {
            int num = 1;
            System.out.print("Enter a positive integer: ");
            userNumber = userInput.nextInt();
            System.out.print(userNumber + "! = ");

        if (userNumber > 0) {
            for (i = 1; i <= userNumber; i++) {
                num = num * i;
                System.out.print(i);

                if (i != userNumber) {
                    System.out.print(" x ");
                }
            }
            System.out.println("");
            System.out.println("The factorial of " + userNumber + " is: " + num);
            y++;
            
        } else {
            System.out.println("Invalid input! Program stopped!");
            break;
        }
        }
        userInput.close();
    }
}
