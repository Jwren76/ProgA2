package Encrypt;
import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			int origInt;
			int dig1;
			int dig2;
			int dig3;
			int dig4;
			
			System.out.println( "Please enter a four digit integer:");
			
			origInt = scnr.nextInt();
			
			
			
			dig4 = origInt % 10;
			dig4 = dig4 + 7;
			dig4 = dig4 % 10;
			
			
			dig3 = origInt / 10;
			dig3 = dig3 % 10;
			dig3 = dig3 + 7;
			dig3 = dig3 % 10;
			
			
			dig2 = origInt / 100;
			dig2 = dig2 % 10;
			dig2 = dig2 + 7;
			dig2 = dig2 % 10;
			
			
			dig1 = origInt / 1000;
			dig1 = dig1 % 10;
			dig1 = dig1 + 7;
			dig1 = dig1 % 10;
			
			System.out.println("The original integer: " + origInt);
			System.out.println("The encrypted integer: " + dig3 + dig4 + dig1 + dig2);
		
		

		}

	}

		

	


