import java.util.Scanner;


public class Print {
    public static void main(String[] args) {
        int a , b, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        a = input.nextInt();
        System.out.println("Enter the height: ");
        b = input.nextInt();
        for(i=0;i<b;i++){
            if(i==0 || i==(b-1)){
                for(j=0;j<a;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(j=0;j<a-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }      
            System.out.println("");
        }
    
    }
}
