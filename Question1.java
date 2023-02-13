import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String FILE_NAME = "scores.txt";
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1, player2;
        int player1Score = 0, player2Score = 0, highestScore = 0;
        String highestScorer = "";

        // Read the highest score from file
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            highestScore = Integer.parseInt(br.readLine().split(" ")[1]);
            highestScorer = br.readLine();
        } catch (IOException e) {
            System.out.println("Unable to read scores from file.");
        }

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Current highest score is " + highestScore + " by " + highestScorer);
        System.out.println("Enter player 1 name: ");
        player1 = sc.nextLine();
        System.out.println("Enter player 2 name: ");
        player2 = sc.nextLine();

        while (true) {
            System.out.println(player1 + ", choose your gesture (rock/paper/scissors): ");
            String player1Gesture = sc.nextLine();
            System.out.println(player2 + ", choose your gesture (rock/paper/scissors): ");
            String player2Gesture = sc.nextLine();

            if (player1Gesture.equalsIgnoreCase(ROCK)) {
                if (player2Gesture.equalsIgnoreCase(SCISSORS)) {
                    System.out.println(player1 + " wins!");
                    player1Score++;
                } else if (player2Gesture.equalsIgnoreCase(PAPER)) {
                    System.out.println(player2 + " wins!");
                    player2Score++;
                } else {
                    System.out.println("It's a draw.");
                }
            } else if (player1Gesture.equalsIgnoreCase(PAPER)) {
                if (player2Gesture.equalsIgnoreCase(ROCK)) {
                    System.out.println(player1 + " wins!");
                    player1Score++;
                } else if (player2Gesture.equalsIgnoreCase(SCISSORS)) {
                    System.out.println(player2 + " wins!");
                    player2Score++;
                } else {
                    System.out.println("It's a draw.");
                }
            } else if (player1Gesture.equalsIgnoreCase(SCISSORS)) {
                if (player2Gesture.equalsIgnoreCase(PAPER)){
                    System.out.println(player3 + " wins!");
                    player1Score++;
                }
          return 0;
            }    