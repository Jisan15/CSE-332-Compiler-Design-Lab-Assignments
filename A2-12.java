
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int myNumber , i;
        Scanner input = new Scanner(System.in);
        myNumber = input.nextInt();
            for(i=1; i<=myNumber;i++){
                System.out.print(i);
            }
           System.out.println("");
    }
}
