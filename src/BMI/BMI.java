package BMI;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double bMI;
		char userSel;
		double userHTH;
		double userWGT;
		
		
		System.out.println("To calculate body mass index, please select standard of measure.");
		System.out.println("Press 'm' for Metric or 's' for Standard:");
		userSel = scnr.next().charAt(0);
		
		
		
		if (userSel == 'm' || userSel == 'M') {
			System.out.println("Please enter your height in meters:");
			userHTH = scnr.nextDouble();
			System.out.println("Please enter your weight in kilograms:");
			userWGT = scnr.nextDouble();
			bMI = (userWGT / (Math.pow(userHTH, 2)));
			System.out.format("Your body mass index is: %.1f", bMI);
			System.out.println("");
			System.out.println("BMI categories from the National Heart Lung and Blood Institute:");
			System.out.println("Underweight =< 18.5");
			System.out.println("Normal weight = 18.5 - 24.9");
			System.out.println("Overweight = 25 - 29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
		}
		
		else if (userSel == 's' || userSel == 'S') {
			System.out.println("Please enter your height in inches:");
			userHTH = scnr.nextDouble();
			System.out.println("Please enter your weight in pounds:");
			userWGT = scnr.nextDouble();
			bMI = (703 * (userWGT / (Math.pow(userHTH, 2))));
			System.out.format("Your body mass index is: %.1f", bMI);
			System.out.println("");
			
			if (bMI <= 18.5) {
				System.out.println("According to the NIH you are underweight");
			}
			else if (bMI < 25.0) {
				System.out.println("According to the NIH you are normal weight");
			}
			
			else if (bMI < 29.9) {
				System.out.println("According to the NIH you are overweight");
			}
			
			else if (bMI >= 30.0) {
				System.out.println("According to the NIH  you are obese");
			
		
		
		}
		
		else {
			System.out.println("Incorrect input. Program will terminate.");
		}
		
		
		
			
			
		}
	
			
			
		
			
		
		
		
	}

	}


