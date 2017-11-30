
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int myNumber, i, j;
        Scanner input = new Scanner(System.in);
        myNumber = input.nextInt();
        for(i=0; i<myNumber;i++){
            for(j=myNumber; j>i;j--){
                System.out.print(" ");
            }
            if(i==0 || i==1 || i==myNumber-1){
                for(j=0; j<=i;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(j=0; j<=i-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
