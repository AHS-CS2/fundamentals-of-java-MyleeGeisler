//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Mylee Geisler
//Date - 1 - 22 - 26
//Class - Computer Science I
//Lab  - Define, input, and print some variables and their values.

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		//add in input for all variables
		//System.out.print("Enter a double :: ");
		//doubleOne = keyboard.nextInt();
		
		//System.out.print("Enter a double :: ");
		//doubleTwo = keyboard.nextInt();


		//System.out.print("Enter a float :: ");
		//floatOne = keyboard.nextInt();

		//System.out.print("Enter a float :: ");
		//floatTwo = keyboard.nextInt();


		//System.out.print("Enter a short :: ");
		//shortOne = keyboard.nextInt();

		//System.out.print("Enter a short :: ");
		//shortTwo = keyboard.nextInt();




		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );

		//add in output for all variables

		//System.out.println("double one = " + doubleOne );
		//System.out.println("double two = " + doubleTwo );

		//System.out.println("float one = " + floatOne );
		//System.out.println("float two = " + floatTwo );

		//System.out.println("short one = " + shortOne );
		//System.out.println("short two = " + shortTwo );
	}
}