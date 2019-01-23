import java.util.*;

public class TaxCalculator {
	public static void main(String[] args) throws InterruptedException {
		String fullname;
		String CVStat;
		double MonthlyPay = 13;
		double GMIncome;
		double taxR;
		double GrossAnnualIncome;
		double AnnualIncomeTax = 0;
		double NetAnnualIncome = 0;
		String computation = "end";
		String answer = "Y";

		System.out.println("BIR	TRAIN  Tax	Calculator");
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Full Name: ");
			fullname = input.nextLine();
			System.out.print("Civil status [Single or Married]: ");
			CVStat = input.nextLine();
			System.out.print("Gross Monthly Income: Php ");
			GMIncome =input.nextInt();
			GrossAnnualIncome = GMIncome*13;
		
			if (GrossAnnualIncome <= 250000.00) {
				AnnualIncomeTax = (0.00+(GrossAnnualIncome-0.00)*.0);
				NetAnnualIncome = (GrossAnnualIncome-(0.00+(GrossAnnualIncome-0.00)*.0));

			}else if(GrossAnnualIncome > 250000.00||GrossAnnualIncome <= 400000.00) {
				AnnualIncomeTax = ((GrossAnnualIncome-250000.00)*.20);
				NetAnnualIncome = (GrossAnnualIncome-((GrossAnnualIncome-250000.00)*.20));

			}else if (GrossAnnualIncome > 400000.00||GrossAnnualIncome <= 800000.00) {	
				AnnualIncomeTax = (80000.00+(GrossAnnualIncome-2000000.00)*.25);
				NetAnnualIncome = (GrossAnnualIncome-(30000.00+(GrossAnnualIncome-400000.00)*.25));

			}else if	(GrossAnnualIncome > 800000.00||GrossAnnualIncome <= 2000000.00) {	
				AnnualIncomeTax = (130000.00+(GrossAnnualIncome-800000.00)*.30);
				NetAnnualIncome = (GrossAnnualIncome-(30000.00+(GrossAnnualIncome-400000.00)*.25));

			}else if (GrossAnnualIncome > 2000000.00||GrossAnnualIncome <= 8000000.00) {	
				AnnualIncomeTax = (490000+(GrossAnnualIncome-2000000)*.32);
				NetAnnualIncome = (GrossAnnualIncome-(490000.00+(GrossAnnualIncome-2000000.00)*.32));	

			}else if (GrossAnnualIncome > 8000000.00) {	
				AnnualIncomeTax = (2410000.00+(GrossAnnualIncome-8000000.00)*.35);
				NetAnnualIncome = (GrossAnnualIncome-(2410000.00+(GrossAnnualIncome-8000000.00)*.35));	
			}else {

			}	
			System.out.println("");
			System.out.println("Calculating...");

			
				Thread.sleep(2000);
			

			System.out.println("Hi, " + fullname);
			System.out.println("Here are the details of your income and tax rate" + 
					" based on the details that you provided: ");
			System.out.println("");
			System.out.println("Gross Annual Income: " + GrossAnnualIncome);
			System.out.print("Annual Income Tax: Php " + AnnualIncomeTax);
			System.out.println("");
			System.out.println("Net Annual Income: Php " + NetAnnualIncome);
			System.out.println("");
			System.out.println("Do you want to try again? (Y/N)");
			Scanner scan = new Scanner(System.in);
			answer = scan.nextLine();
		}while (answer.equals("Y") ||answer.equals("y")); 

		System.out.println("Thank you " + fullname + " and goodbye!");
	}
}

