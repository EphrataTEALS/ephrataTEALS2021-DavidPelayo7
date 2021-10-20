
import java.util.Scanner;


public class Problem3 {
    public static void main(String[] args) {
        int sum = 1000;
        int total = 1000;
        int count1 = 0;
        int count2 = 0;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Is your money multiplied by 1 or 2 times? ");
        // NOTE: for this problem, assume the user only ever enters 1 or 2
        int times = console.nextInt();
        
        if (times == 1) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + donation;
            count1++;
            total = total + donation;
        }
        if (times == 2) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + 2 * donation;
            count2++;
            total = total + donation;
        }
        
        System.out.println("The final total is " + total);
        System.out.println("The final sum is " + sum);
        System.out.println("The final counts are " + count1 + " 1s and " + count2 + " 2s");
    }
}
