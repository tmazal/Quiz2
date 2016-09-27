package quiz2;
import java.util.Scanner;

public class Tuition {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); // Create Scanner Object
		
		System.out.println("What is the starting tuition cost?"); // Asks for initial tuition cost
		double Tuition = input.nextDouble();
		
		System.out.println("What is the percent increase in tuition each year? (Give in %)"); // Asks for % increase (ASSUMED CONSTANT!)
		double Percent = (input.nextDouble())/100;
		
		input.close();
		
		double totalTuition = 0;
		for (int i = 0; i<4;i++){
			if (i != 0){ // For years 2,3,4 the percentage increase in tuition is applied
				Tuition *= (1+Percent);
				totalTuition += Tuition;
			}
			else {
				totalTuition += Tuition;
			}
		}
		System.out.printf("The total cost for 4 years of tuition comes out to $%.2f", totalTuition);
	}
}
