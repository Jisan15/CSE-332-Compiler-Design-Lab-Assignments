
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int myNumber = input.nextInt();
        
        for(int i = 1; i <= myNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
