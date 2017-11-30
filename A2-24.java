
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int lineNumber , i, j;
        Scanner input = new Scanner(System.in);

        lineNumber = input.nextInt();

        for(i=1;i<=lineNumber;i++){
            System.out.print(i);
        }
        for(j=lineNumber-1;j>=1;j--){
            System.out.print(j);
        }
        System.out.println("");
    }
}
