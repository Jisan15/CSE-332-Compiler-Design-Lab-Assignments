
import java.util.Scanner;


public class Print {
     public static void main(String[] args) {
        int lineNumber , i, j;
        Scanner input = new Scanner(System.in);

        lineNumber = input.nextInt();

        for(i=1; i<=lineNumber;i++){
            if(i==1 || i==2 || i==lineNumber){
                for(j=1; j<=i;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1; j<=i-2;j++){
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
