
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        
        for(int i = 1; i <= firstNumber; i++) {
            for(int j = 1; j <= secondNumber; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
