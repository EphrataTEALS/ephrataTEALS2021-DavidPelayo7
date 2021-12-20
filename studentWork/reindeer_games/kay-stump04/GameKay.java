import java.util.*;

public class GameKay {
    public static void main(String[] args) {
        Scanner coinflip = new Scanner (System.in);

        String userchoice = "";
        System.out.println("Choose Heads or Tales");
        userchoice = coinflip.next();
        System.out.println(userchoice);
        Random computer = new Random();
        double computerChoice = computer.nextDouble();
        String computerChoiceString = "";
        System.out.println(computerChoice);
        if (computerChoice <0.5) {
            computerChoiceString = "Heads";
        } else {
            computerChoiceString = "Tales";
        }
        System.out.println("computerChoiceString");
        
        if (userchoice.equals(computerChoiceString)){
            System.out.println("Both choices were the same: You won!");
        } else {
            System.out.println("The choices were not the same: You lost");
        }
    }
    
}