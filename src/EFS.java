import java.util.Scanner;

public class EFS 
{
	static Scanner scan = new Scanner(System.in);
	
	public static double efs(double total_Efactor)
	{
		System.out.println("\n>>>>>> Calculation for Experience Factors <<<<<<\n");
		
		System.out.println("Insert numbers between 1 to 5");
		
		System.out.println("\nE1 : Familiar with FPT software process");
		System.out.print("Insert weight factor of E1 (IF HAVE) : ");
		double E_insert1 = scan.nextDouble();
		double E1 = E_insert1 * 4;

		System.out.println("\nE2 : Application experience");
		System.out.print("Insert weight factor of E2 (IF HAVE) : ");
		double E_insert2 = scan.nextDouble();
		double E2 = E_insert2 * 2;

		System.out.println("\nE3 : Paradigm experience (OO)");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert3 = scan.nextDouble();		
		double E3 = E_insert3 * 4;

		System.out.println("\nE4 : Lead analyst capability");
		System.out.print("Insert weight factor of E4 (IF HAVE) : ");
		double E_insert4 = scan.nextDouble();	
		double E4 = E_insert4 * 4;

		System.out.println("\nE5 : Motivation");
		System.out.print("Insert weight factor of E5 (IF HAVE) : ");
		double E_insert5 = scan.nextDouble();	
		double E5 = E_insert5* 4;

		System.out.println("\nE6 : Stable Requirements");
		System.out.print("Insert weight factor of E6 (IF HAVE) : ");
		double E_insert6 = scan.nextDouble();	
		double E6 = E_insert6 * 2;

		System.out.println("\nE7 : Part-time workers");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert7 = scan.nextDouble();	
		double E7 = E_insert7 * 0;

		System.out.println("\nE8 : Difficulty of programming language");
		System.out.print("Insert weight factor of E3 (IF HAVE) : ");
		double E_insert8 = scan.nextDouble();	
		double E8 = E_insert8 * 3;

		total_Efactor = E1 + E2 + E3 + E4 + E5 + E6 + E7 + E8;
		
		System.out.print("\nTotal experience factors = "+total_Efactor+"\n\n");
			
		return total_Efactor;
	}
}
