import java.util.*;

public class gameProject {

    public static void main(String[] args) {

        // intro message
        Intro();

        // play the game
        int playAgain = 0;
        Random r = new Random();
        while (playAgain != -1) {
            Scanner poop2 = new Scanner(System.in);

            // selecting level of difficulty
            String difficulty = level();

            if (difficulty.equals("Easy")) {
                int compNum = r.nextInt(10)+1;
                System.out.println("The computer has choosen a number from 0 to 10. You have to guess the correct number within 4 guesses to WIN!");
                for (int i = 0; i < 4; i++) {
                    int guessleft = 4 - i;
                    System.out.println("You have " + guessleft + " guesses left!");
                    System.out.println("");
                    System.out.println("What is your guess?");
                    int guess = poop2.nextInt();
                    if (guess < compNum) {
                        System.out.println("Your guess is TOO LOW!");
                    } else if (guess > compNum) {
                        System.out.println("Your guess is TOO HIGH!");
                    } else {
                        System.out.println("That's CORRECT the computer chose " + compNum + " Horray! You WIN!");
                        System.out.println(" ");
                        i += 4;
                    }  }  }
        else if (difficulty.equals("Medium")) {
                        int compNum = r.nextInt(50)+1;
                        System.out.println("The computer has choosen a number from 0 to 50. You have to guess the correct number within 6 guesses to WIN!");
                        for (int i = 0; i < 6; i++) {
                            int guessleft = 6 - i;
                            System.out.println("You have " + guessleft + " guesses left!");
                            System.out.println("");
                            System.out.println("What is your guess?");
                            int guess = poop2.nextInt();
                            if (guess < compNum) {
                                System.out.println("Your guess is TOO LOW!");
                            } else if (guess > compNum) {
                                System.out.println("Your guess is TOO HIGH!");
                            } else {
                                System.out.println("That's CORRECT the computer chose " + compNum + " Horray! You WIN!");
                                System.out.println(" ");
                                i += 6;
                            }}}
            else if (difficulty.equals("Hard")) {
                                int compNum = r.nextInt(100)+1;
                                System.out.println(
                                        "The computer has choosen a number from 0 to 100. You have to guess the correct number within 8 guesses to WIN!");
                                for (int i = 0; i < 8; i++) {
                                    int guessleft = 8 - i;
                                    System.out.println("You have " + guessleft + " guesses left!");
                                    System.out.println("");
                                    System.out.println("What is your guess?");
                                    int guess = poop2.nextInt();
                                    if (guess < compNum) {
                                        System.out.println("Your guess is TOO LOW!");
                                    } else if (guess > compNum) {
                                        System.out.println("Your guess is TOO HIGH!");
                                    } else {
                                        System.out.println("That's CORRECT the computer chose " + compNum + " Horray! You WIN!");
                                        System.out.println(" ");
                                        i += 8;
                                    }}}
                System.out.println("Enter -1 if you want to quit. Any other number to play again");
                playAgain = poop2.nextInt();
        }

    }

    // intro message - called before each game
    public static void Intro() {
        System.out.println("Welcome to Mr.Cummings' Guessing Game.");
        System.out.println("");
        System.out.println("?/?/?/?/?/?/?/?/?/?/?/");
        System.out.println("");
    }

    public static String level() {
        String level = "Not Selected";
        Scanner poop = new Scanner(System.in);
        while (!level.equals("Easy") && !level.equals("Medium") && !level.equals("Hard")) {
            System.out.println("First select your dificulty - enter 1 for Easy, 2 for Medium and 3 for Hard.");
            int duck = poop.nextInt();

            if (duck == 1) {
                level = "Easy";
                System.out.println("");
                System.out.println("I see you chose Easy - A little scared are you?");
                System.out.println("");
            } else if (duck == 2) {
                level = "Medium";
                System.out.println("");
                System.out.println("I see you chose Medium - Steppin it up just a little bit.");
                System.out.println("");
            } else if (duck == 3) {
                level = "Hard";
                System.out.println("");
                System.out.println("I see you chose Hard - How couragous!");
                System.out.println("");

            } else {
                System.out.println("");
                System.out.println("That is not a valid entry. Try Again.");
                System.out.println("");

            }

        }
        return level;
    }

}