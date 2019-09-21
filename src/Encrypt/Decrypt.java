package Encrypt;
import java.util.Scanner;
public class Decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int encryInt;
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		System.out.println( "Please enter a four digit encrypted integer:");
		
		encryInt = scnr.nextInt();
		
		dig4 = encryInt % 10;
			if (dig4 >= 7) {
				dig4 = dig4 - 7;
			}
			
			else {
				dig4 = dig4 + 3;
			}
		
		dig3 = encryInt / 10;
		dig3 = dig3 % 10;
			if (dig3 >= 7) {
				dig3 = dig3 - 7;
			}
		
			else {
				dig3 = dig3 + 3;
			}
		
		dig2 = encryInt / 100;
		dig2 = dig2 % 10;
			if (dig2 >= 7) {
				dig2 = dig2 - 7;
			}
			
			else {
				dig2 = dig2 + 3;
			}
			
			dig1 = encryInt / 1000;
			dig1 = dig1 % 10;
				if (dig1 >= 7) {
					dig1 = dig1 - 7;
				}
				
				else {
					dig1 = dig1 + 3;
				}
			
			
			System.out.println("The original encrypted integer: " + encryInt);
			System.out.print("The decrypted integer: " + dig3 + dig4 + dig1 + dig2);
		

	}

}


