/*
 * Name: Megh Patel and Nirmal Patel
 * Title: Java lab 1
 * Student ID: 100802838 and 100830820
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // players name
        String[] players = {"Megh", "Nirmal", "Tom"};

        // games to be played
        int TOTAL_GAMES = 2;

        // 2D array to
        int[][] scores = new int[players.length][TOTAL_GAMES];

        // going through each name for 2 games score
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < console.Instance().NUM_OF_PLAYERS; i++) {
            for (int j = 0; j < console.Instance().NUM_OF_GAMES; j++) {

                // validation for input and range
                try {
                    System.out.print("Please enter " + players[i] + "'s score for Game " + (j + 1) + ": ");
                    scores[i][j] = sc.nextInt();
                    while (scores[i][j] < 0 || scores[i][j] > 300)
                    {
                        System.out.println("Invalid input. enter value between 0 to 300.");
                        System.out.print("Please enter " + players[i] + "'s score for Game#" + (j + 1) + ": ");
                        scores[i][j] = sc.nextInt();
                    }
                }
                catch (InputMismatchException ex)
                {
                    System.out.println("Invalid input. Please try again(numbers only).");
                    j = j - 1; // ask for that input again
                    sc.nextLine();
                }

            }
        }
        // display output
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < players.length; i++) {
            output.append(String.format("Score Details for %s: %nGAME # 1: %5s%nGAME # 2: %5s%nAverage for %s: %s %n%n", players[i], scores[i][0],scores[i][1], players[i], ((double) (scores[i][0] + scores[i][1])) / 2));
        }
        System.out.println(output);
    }
}


