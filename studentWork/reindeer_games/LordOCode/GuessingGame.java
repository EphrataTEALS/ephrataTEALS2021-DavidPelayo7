 import java.util.Scanner;
 import java.util.Random;

     public class GuessingGame{

     public static void main(String[] args){
     
     int turnCount = 6;
     Random r = new Random();
     int answer = r.nextInt(100);
        try (Scanner Guess = new Scanner(System.in)) {
          while(turnCount >= 0){
           System.out.println("Enter a number between 0 and 100");
           int finalGuess = Guess.nextInt();
          if(finalGuess == answer){
            System.out.println("Nice! the answer is " + answer);
          }
           else if (finalGuess > answer){
            System.out.println("Too High.");
           }
            else if (finalGuess < answer){
             System.out.println("Too Low");
            turnCount--;
            }
          }
        }
          
         System.out.println("Thanks for playing!");
      }    
   }   