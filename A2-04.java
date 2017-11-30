
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int myNumber = input.nextInt();
        
        for(int i=0; i<myNumber;i++){
            for(int j=myNumber; j>i;j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
       
}

