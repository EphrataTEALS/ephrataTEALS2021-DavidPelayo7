import java.util.Scanner;
import java.util.Random;
public class guessinggame {
    


public static void main(String [] args ){
Random rannumber = new Random();
    Scanner randnumber = new Scanner (System.in);
    System.out.print("choose a random number: ");
   int compchoice  = randnumber.nextInt(30);
   

    
    int guess;
    boolean correct = false;

    while (!correct){
        System.out.print( "Guess: ");
        Scanner userchoice = new Scanner(System.in);
        guess = userchoice.nextInt();
        
        if (guess == compchoice) {
            correct= true ;
            System.out.println("you are right ");
        }
        else if (guess < compchoice){
            System.out.println("Higher");
        }
        else if (guess > compchoice){
            System.out.println("lower");
        }

    }


}
}