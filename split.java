import java.util.Scanner;

public class SPLIT {

		public static void main(String args[])
		{
			System.out.println("Enter your String: ");
			Scanner Jisan = new Scanner(System.in);
			String str = Jisan.nextLine();
			String [] arraySplit = str.split(" ",0);
			for (String character : arraySplit) {
				System.out.println(character);
			}

			Jisan.close();
	  }

}
