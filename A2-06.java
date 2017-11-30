
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int a = input.nextInt();
        for(int i=1; i<=a;i++){
            for(int j=a; j>=i;j--){
                System.out.print(" ");
            }
           for(int j=1; j<=(i*2)-1;j++){
               System.out.print("*");
           }
            System.out.println("");
        }
        for(int i=a-1; i>=1;i--){
            for(int j=i; j<=a;j++){
                System.out.print(" ");
           }
            for(int j=1; j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

