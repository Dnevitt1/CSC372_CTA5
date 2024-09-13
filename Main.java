import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		int[] userInput = new int[5]; 
		
		System.out.println("Enter 5 numbers: "); 
		for (int i = 0; i < 5; ++i) {
			System.out.println("Number " + (i + 1) + ":");
			userInput[i] = scnr.nextInt(); 
		}
		
		scnr.close();
		int sum = userProduct(userInput, 0 );
		System.out.println("The sum of the five numbers is: " + sum);
	
	}
	
	private static int userProduct(int[] userInput, int userNums) { 
		
		if (userNums == userInput.length) return 1;
		else {
			return userInput[userNums] * userProduct(userInput, userNums + 1);
		}  
	}
}