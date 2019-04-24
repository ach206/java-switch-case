*/
write a program that will return the alphabet characters that matches with the numbers on a telephone.
*/

import java.util.*;
public class InClass417 {

	public static void main(String[] args) {
  //requests and collects the number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
    
 //iterates user input through switch cases
 
		switch(number) {
		case 2: 
			System.out.println("ABC");
			break;

		case 3: 
			System.out.println("DEF");
			break;

		case 4: 
			System.out.println("GHI");
			break;

		case 5: 
			System.out.println("JKL");
			break;

		case 6:
			System.out.println("MNO");
			break;

		case 7:
			System.out.println("PQRS");
			break;

		case 8:
			System.out.println("TUV");
			break;

		case 9:
			System.out.println("WXYZ");
		case 1:
		case 0:
			System.out.println(" ");
			break;
