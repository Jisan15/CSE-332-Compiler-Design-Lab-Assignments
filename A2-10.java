
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int myNumber , i, j;
        Scanner input = new Scanner(System.in);
        myNumber = input.nextInt();
        for(i=1; i<=myNumber;i++){
            for(j=myNumber; j>=i; j--){
                System.out.print(" ");
            }
            if(i==1 || i==myNumber){
                for(j=1; j<=(i*2)-1;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(j=0;j<(i*2)-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
