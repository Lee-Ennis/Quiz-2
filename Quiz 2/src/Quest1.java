import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Quest1 {
	public static void main(String[]args){
		Scanner scan1 = new Scanner(System.in);
		
				
		System.out.println("First year's tuition");
		
		double tuition = scan1.nextDouble();
		double fourYearTuition = tuition;
		
		for (int i = 1; i <= 3; i++){ // in years
			System.out.println("Percentage increase of tuition:" + i);
			double tuitionPercent = scan1.nextDouble();
			tuition *= tuitionPercent/100 + 1;
			fourYearTuition += Math.round(tuition);
			
			
		}
		System.out.println("The total four year tuition is:" + fourYearTuition);
		scan1.close();
		
		
	}


}





