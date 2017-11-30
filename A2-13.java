
import java.util.Scanner;


public class Print {
     public static void main(String[] args) {
        int lineNumber , starNumber, i, j;
        Scanner input = new Scanner(System.in);

        lineNumber = input.nextInt();
        starNumber = input.nextInt();

        for(i=1; i<=lineNumber;i++){
            for(j=1; j<=starNumber;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
