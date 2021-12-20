import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userChoice = "";
        System.out.println("Enter a number between 1 and 100. To quit type quit.");
        
        while(!userChoice.equals("quit")){

        userChoice = console.next().toLowerCase();
        System.out.println(userChoice);
        Random computer = new Random();
        double computerChoice = computer.nextDouble();
        String computerChoiceString = "";

        System.out.println(computerChoice);
        if (computerChoice <= 0.01) {
            computerChoiceString = "1";
        } else if(computerChoice <= 0.02) {
            computerChoiceString = "2";
        } else if (computerChoice <= 0.03) {
            computerChoiceString = "3";
        } else if (computerChoice <= 0.04) {
            computerChoiceString = "4";
        } else if (computerChoice <= 0.05) {
            computerChoiceString = "5";
        } else if (computerChoice <= 0.06) {
            computerChoiceString = "6";
        } else if (computerChoice <= 0.07) {
            computerChoiceString = "7";
        } else if (computerChoice <= 0.08) {
            computerChoiceString = "8";
        } else if (computerChoice <= 0.09) {
            computerChoiceString = "9";
        } else if (computerChoice <= 0.10) {
            computerChoiceString = "10";
        } else if(computerChoice <= 0.11) {
            computerChoiceString = "11";
        } else if (computerChoice <= 0.12) {
            computerChoiceString = "12";
        } else if (computerChoice <= 0.13) {
            computerChoiceString = "13";
        } else if (computerChoice <= 0.14) {
            computerChoiceString = "14";
        } else if (computerChoice <= 0.15) {
            computerChoiceString = "15";
        } else if (computerChoice <= 0.16) {
            computerChoiceString = "16";
        } else if (computerChoice <= 0.17) {
            computerChoiceString = "17";
        } else if (computerChoice <= 0.18) {
            computerChoiceString = "18";
        } else if (computerChoice <= 0.19) {
            computerChoiceString = "19";
        } else if (computerChoice <= 0.20) {
            computerChoiceString = "20";
        } else if (computerChoice <= 0.21) {
            computerChoiceString = "21";
        } else if (computerChoice <= 0.22) {
            computerChoiceString = "22";
        } else if (computerChoice <= 0.23) {
            computerChoiceString = "23";
        } else if (computerChoice <= 0.24) {
            computerChoiceString = "24";
        } else if (computerChoice <= 0.25) {
            computerChoiceString = "25";
        } else if (computerChoice <= 0.26) {
            computerChoiceString = "26";
        } else if (computerChoice <= 0.27) {
            computerChoiceString = "27";
        } else if (computerChoice <= 0.28) {
            computerChoiceString = "28";
        } else if (computerChoice <= 0.29) {
            computerChoiceString = "29";
        } else if (computerChoice <= 0.30) {
            computerChoiceString = "30";
        } else if (computerChoice <= 0.31) {
            computerChoiceString = "31";
        } else if (computerChoice <= 0.32) {
            computerChoiceString = "32";
        } else if (computerChoice <= 0.33) {
            computerChoiceString = "33";
        } else if (computerChoice <= 0.34) {
            computerChoiceString = "34";
        } else if (computerChoice <= 0.35) {
            computerChoiceString = "35";
        } else if (computerChoice <= 0.36) {
            computerChoiceString = "36";
        } else if (computerChoice <= 0.37) {
            computerChoiceString = "37";
        } else if (computerChoice <= 0.38) {
            computerChoiceString = "38";
        } else if (computerChoice <= 0.39) {
            computerChoiceString = "39";
        } else if (computerChoice <= 0.40) {
            computerChoiceString = "40";
        } else if (computerChoice <= 0.41) {
            computerChoiceString = "41";
        } else if (computerChoice <= 0.42) {
            computerChoiceString = "42";
        } else if (computerChoice <= 0.43) {
            computerChoiceString = "43";
        } else if (computerChoice <= 0.44) {
            computerChoiceString = "44";
        } else if (computerChoice <= 0.45) {
            computerChoiceString = "45";
        } else if (computerChoice <= 0.46) {
            computerChoiceString = "46";
        } else if (computerChoice <= 0.47) {
            computerChoiceString = "47";
        } else if (computerChoice <= 0.48) {
            computerChoiceString = "48";
        } else if (computerChoice <= 0.49) {
            computerChoiceString = "49";
        } else if (computerChoice <= 0.50) {
            computerChoiceString = "50";
        } else if (computerChoice <= 0.51) {
            computerChoiceString = "51";
        } else if (computerChoice <= 0.52) {
            computerChoiceString = "52";
        } else if (computerChoice <= 0.53) {
            computerChoiceString = "53";
        } else if (computerChoice <= 0.54) {
            computerChoiceString = "54";
        } else if (computerChoice <= 0.55) {
            computerChoiceString = "55";
        } else if (computerChoice <= 0.56) {
            computerChoiceString = "56";
        } else if (computerChoice <= 0.57) {
            computerChoiceString = "57";
        } else if (computerChoice <= 0.58) {
            computerChoiceString = "58";
        } else if (computerChoice <= 0.59) {
            computerChoiceString = "59";
        } else if (computerChoice <= 0.60) {
            computerChoiceString = "60";
        } else if (computerChoice <= 0.61) {
            computerChoiceString = "61";
        } else if (computerChoice <= 0.62) {
            computerChoiceString = "62";
        } else if (computerChoice <= 0.63) {
            computerChoiceString = "63";
        } else if (computerChoice <= 0.64) {
            computerChoiceString = "64";
        } else if (computerChoice <= 0.65) {
            computerChoiceString = "65";
        } else if (computerChoice <= 0.66) {
            computerChoiceString = "66";
        } else if (computerChoice <= 0.67) {
            computerChoiceString = "67";
        } else if (computerChoice <= 0.68) {
            computerChoiceString = "68";
        } else if (computerChoice <= 0.69) {
            computerChoiceString = "69";
        } else if (computerChoice <= 0.70) {
            computerChoiceString = "70";
        } else if (computerChoice <= 0.71) {
            computerChoiceString = "71";
        } else if (computerChoice <= 0.72) {
            computerChoiceString = "72";
        } else if (computerChoice <= 0.73) {
            computerChoiceString = "73";
        } else if (computerChoice <= 0.74) {
            computerChoiceString = "74";
        } else if (computerChoice <= 0.75) {
            computerChoiceString = "75";
        } else if (computerChoice <= 0.76) {
            computerChoiceString = "76";
        } else if (computerChoice <= 0.77) {
            computerChoiceString = "77";
        } else if (computerChoice <= 0.78) {
            computerChoiceString = "78";
        } else if (computerChoice <= 0.79) {
            computerChoiceString = "79";
        } else if (computerChoice <= 0.80) {
            computerChoiceString = "80";
        } else if (computerChoice <= 0.81) {
            computerChoiceString = "81";
        } else if (computerChoice <= 0.82) {
            computerChoiceString = "82";
        } else if (computerChoice <= 0.83) {
            computerChoiceString = "83";
        } else if (computerChoice <= 0.84) {
            computerChoiceString = "84";
        } else if (computerChoice <= 0.85) {
            computerChoiceString = "85";
        } else if (computerChoice <= 0.86) {
            computerChoiceString = "86";
        } else if (computerChoice <= 0.87) {
            computerChoiceString = "87";
        } else if (computerChoice <= 0.88) {
            computerChoiceString = "88";
        } else if (computerChoice <= 0.89) {
            computerChoiceString = "89";
        } else if (computerChoice <= 0.90) {
            computerChoiceString = "90";
        } else if (computerChoice <= 0.91) {
            computerChoiceString = "91";
        } else if (computerChoice <= 0.92) {
            computerChoiceString = "92";
        } else if (computerChoice <= 0.93) {
            computerChoiceString = "93";
        } else if (computerChoice <= 0.94) {
            computerChoiceString = "94";
        } else if (computerChoice <= 0.95) {
            computerChoiceString = "95";
        } else if (computerChoice <= 0.96) {
            computerChoiceString = "96";
        } else if (computerChoice <= 0.97) {
            computerChoiceString = "97";
        } else if (computerChoice <= 0.98) {
            computerChoiceString = "98";
        } else if (computerChoice <= 0.99) {
            computerChoiceString = "99";
        } else {
            computerChoiceString = "100";
        }
        System.out.println(computerChoiceString);
        
        if(computerChoiceString.equals(userChoice)){
            System.out.println("You guessed right!");
        } else if (computerChoiceString != (userChoice)){
            System.out.println("You guessed wrong.");
        } else if (userChoice.equals("quit")){
            System.out.println("You have quit the game.");
        }
        }  
    }
}