
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int starNumber = input.nextInt();
        
        for(int i = 1; i <= 6; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
