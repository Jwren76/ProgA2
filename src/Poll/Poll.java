package Poll;
import java.util.Scanner;
public class Poll {

	public static void main(String[] args) {
		String[]topics = {"School","Health","Actors","Albums","Ballet"};
		double[] Aver = new double [5];
		int i;
		int j;
		int numUser;
		int resp;
		char userSel;
		double max = Aver[0];
		double min = 20;
		int index1 = 0;
		int index2 = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter number of polling participants: ");
		numUser = scnr.nextInt();
		int [][] arResponse = new int[5][10];
		
		
		for (i=0; i < numUser; ++i) {
			System.out.println("Participant #" + (i+1) + " press 'y' to proceed");
			userSel = scnr.next().charAt(0);
			if (userSel == 'y' || userSel == 'Y') {
				for (j=0; j <= 4; ++j) {
					System.out.println("Rate importance of " + topics[j] + " on a scale of 1 - 10 ");
					resp = scnr.nextInt();
					arResponse[j][(resp -1)]= arResponse[j][(resp -1)] + resp;
				}
					
			}
		
			
			}
		for (i=0; i<=4; ++i)  {
			for (j=0; j<=9; ++j) {
				Aver[i] = Aver[i] + arResponse[i][j];
			}
			Aver[i]= Aver[i] / numUser;
		}
		System.out.printf("%-6s%8s%8s%8s%8s%8s%8s%8s%8s%8s%8s%9s\n", "Topics", "1", "2", "3", "4","5", "6", "7", "8", "9", "10", "Average");
		
		for (i=0; i<=4; ++i) {
			System.out.print("" + topics[i]);
			for(j=0; j<=9; ++j) {
				System.out.printf("%8d", arResponse[i][j]);
			}
			System.out.printf("%8.2f", Aver[i]);
			System.out.println("");
			
		}
		
		for (i=0; i<=4; ++i) {
			if (max < Aver[i]) {
				max = Aver[i];
				index1 = i;
			}
		}
		System.out.println("The most important topic was " + topics[index1]);
		System.out.printf ("It averaged a %.2f score." , max);
		System.out.println("");
		
		
		for (i=0; i<=4; ++i) {
			if (min > Aver[i]) {
				min = Aver[i];
				index2 = i;
			}
		}
		
		
		System.out.println("The most least topic was " + topics[index2]);
		System.out.printf ("It averaged a %.2f score." , min);
		System.out.println("");
		
		
		
	}

	}


