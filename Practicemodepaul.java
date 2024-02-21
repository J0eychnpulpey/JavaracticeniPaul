

package com.practicemodepaul;

import java.util.Scanner;

/**
 *
 * @author johnpaul
 */
public class ManokniPedro {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Who's first? Chicken or Egg? (Enter 'a' for Egg or 'b' for Chicken):      ");

        // Get user input
        char answer = input.next().charAt(0); // Store the first character of the user's answer

        // Convert input to lowercase (optional, for easier comparison)
        answer = Character.toLowerCase(answer);

        // Perform comparison with user input
        if        (answer == 'a') {
            System.out.println("Lol so your mother is the one who babysit the egg?");
        } else if (answer == 'b') {
            System.out.println("I agree with you!");
        } else {
            System.out.println("Invalid input. Please enter 'a' or 'b'.");
        }

        input.close(); // Close the Scanner 
    }
}
