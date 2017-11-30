
import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int widthNumber , b, i, j;
        Scanner input = new Scanner(System.in);

        widthNumber = input.nextInt();
        heightNumber = input.nextInt();

        for(i=1;i<=heightNumber;i++){
            if(i==1 || i==heightNumber){
                for(j=1;j<=widthNumber;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1;j<=widthNumber-2;j++){
                    System.out.print(" ");
                }
                System.out.print(widthNumber);
            }
            System.out.println("");
        }
    }
}
