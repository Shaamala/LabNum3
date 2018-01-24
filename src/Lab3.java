/*
 * Abduljabba Shaamala
 * Lab Number 2
 */
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		// input function promtion
		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		
		String cont = "y"; // to control loop process
		int num = 0;
		int squaredNum = 0;
		int cubedNum = 0;

		while (cont.equalsIgnoreCase("y")) {     // to pass lowe or upper case letter
			System.out.println("Enter an integer: ");
			// user input
			num = scan.nextInt();
			System.out.println("Number		Squared		Cubed");
			System.out.println("======		=======		=====");
			// generte numbers from 1 till reach input number
			for (int i = 1; i <= num; ++i) {
				squaredNum = i * i;
				cubedNum = i * i * i;
				System.out.println(i + "\t\t" + squaredNum + "\t\t" + cubedNum);
			}

			System.out.println("Do yo want to continue? y/n");
			// get user input for continue
			cont = scan.next();

		}

		// let the user know the program has end
		System.out.println("Goodbye!");
		scan.close();
	}

}
