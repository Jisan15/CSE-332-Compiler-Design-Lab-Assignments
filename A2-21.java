
import java.util.Scanner;


public class Print {

public static void main(String[] args) {
        int lineNumber , i, j, k;
        Scanner input = new Scanner(System.in);

        lineNumber = input.nextInt();

        k=1;
        for(i=lineNumber; i>=1;i--){
            for(j=1; j<=i;j++){
                System.out.print(" ");
            }
            if(i==lineNumber || i==lineNumber-1 || i==1){
                for(j=i;j<=lineNumber;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(i);

                for(j=0;j<k;j++){
                    System.out.print(" ");
                }
                k++;
                System.out.print(lineNumber);
            }
        System.out.println("");
        }
    }
}
