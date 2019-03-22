import java.util.Scanner;

public class TechFactor 
{
	static Scanner scan = new Scanner(System.in);
	
	public static double tech_factor(double total_Tfactor)
	{
		System.out.println("\n>>>>>> Calculation for Technical Factors <<<<<<");
		
		System.out.println("\nInsert numbers between 1 to 5");
		
		System.out.println("\nT1 : Must have a distributed solution");
		System.out.print("Insert weight factor of T1 (IF HAVE) : ");
		double T_insert1 = scan.nextDouble();
		double T1 = T_insert1 * 5;

		System.out.println("\nT2 : Must respond to specific performance objectives");
		System.out.print("Insert weight factor of T2 (IF HAVE) : ");
		double T_insert2 = scan.nextDouble();
		double T2 = T_insert2 * 3;

		System.out.println("\nT3 : Must meet end-user efficiency desires");
		System.out.print("Insert weight factor of T3 (IF HAVE) : ");
		double T_insert3 = scan.nextDouble();		
		double T3 = T_insert3 * 5;

		System.out.println("\nT4 : Complex internal processing");
		System.out.print("Insert weight factor of T4 (IF HAVE) : ");
		double T_insert4 = scan.nextDouble();	
		double T4 = T_insert4 * 5;

		System.out.println("\nT5 : Code must be reusable");
		System.out.print("Insert weight factor of T5 (IF HAVE) : ");
		double T_insert5 = scan.nextDouble();
		double T5 = T_insert5 * 3;

		System.out.println("\nT6 : Must be easy to install");
		System.out.print("Insert weight factor of T6 (IF HAVE) : ");
		double T_insert6 = scan.nextDouble();
		double T6 = T_insert6 * 3;

		System.out.println("\nT7 : Must be easy to use");
		System.out.print("Insert weight factor of T7 (IF HAVE) : ");
		double T_insert7 = scan.nextDouble();
		double T7 = T_insert7 * 3;

		System.out.println("\nT8 : Must be portable");
		System.out.print("Insert weight factor of T8 (IF HAVE) : ");
		double T_insert8 = scan.nextDouble();
		double T8 = T_insert8 * 0;

		System.out.println("\nT9 : Must be easy to change");
		System.out.print("Insert weight factor of T9 (IF HAVE) : ");
		double T_insert9 = scan.nextDouble();
		double T9 = T_insert9 * 5;

		System.out.println("\nT10 : Must allow concurrent users");
		System.out.print("Insert weight factor of T10 (IF HAVE) : ");
		double T_insert10 = scan.nextDouble();
		double T10 = T_insert10 * 0;

		System.out.println("\nT11 : Includes special security features");
		System.out.print("Insert weight factor of T11 (IF HAVE) : ");
		double T_insert11 = scan.nextDouble();
		double T11 = T_insert11 * 5;

		System.out.println("\nT12 : Must provide direct access for 3rd parties");
		System.out.print("Insert weight factor of T12 (IF HAVE) : ");
		double T_insert12 = scan.nextDouble();
		double T12 = T_insert12 * 0;

		System.out.println("\nT13 : Requires special user training facilities");
		System.out.print("Insert weight factor of T13 (IF HAVE) : ");
		double T_insert13 = scan.nextDouble();
		double T13 = T_insert13 * 3;

		total_Tfactor = T1 + T2 + T3 + T4 + T5 + T6 + T7 + T8 + T9 + T10 + T11 + T12 + T13;
		
		System.out.print("\nTotal technical factor = "+total_Tfactor+"\n\n");
		
		return total_Tfactor;
	}
}
