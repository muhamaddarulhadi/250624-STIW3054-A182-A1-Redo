import java.util.Scanner;

public class EFR 
{
	static Scanner scan = new Scanner(System.in);
	
	public static double efr()
	{
		System.out.println("\n>>>>>> Calculation for Estimating for Reports <<<<<<\n");
		
		System.out.print("Insert quantity of simple report (IF HAVE) : ");
		int quantity_report1 = scan.nextInt();
		int Simple_Report = quantity_report1 * 12;
				
		System.out.print("Insert quantity of average report (IF HAVE) : ");
		int quantity_report2 = scan.nextInt();		
		int Average_Report = quantity_report2 * 20;
						
		System.out.print("Insert quantity of complex report (IF HAVE) : ");
		int quantity_report3 = scan.nextInt();
		int Complex_Report = quantity_report3 * 40;

		int total_report = Simple_Report + Average_Report + Complex_Report;

		System.out.println("\nTotal man-hours report = "+total_report+"\n");
		
		return total_report;
	}
}
