
import java.util.Scanner;


public class Print {
     public static void main(String[] args) {
        int lineNumber , i, j;
        Scanner input = new Scanner(System.in);

        lineNumber = input.nextInt();

        for(i=1; i<=lineNumber;i++){
            for(j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
