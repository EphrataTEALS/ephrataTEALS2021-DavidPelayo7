
import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        
        int b = 5;

        if (x % 3 <= 0) {
            b -= x;
            x = b;
        } else if (x % 3 == 1) {
            b = b - x;
            x = 7;
        } else if (x % 3 == 2) {
            b += -x;
            x += 3;
        } else {
            b = -100;
            x = -100;
        }
        System.out.println("The final values are " + b + " and " + x);
    }
}
