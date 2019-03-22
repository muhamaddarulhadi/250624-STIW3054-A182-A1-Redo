import java.util.InputMismatchException;
import java.util.Scanner;

public class Estimate 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double actor = 0, useCase = 0, Tfactor = 0, Efactor = 0;
		
		System.out.println("\nSOFTWARE ESTIMATION SYSTEM");
		System.out.println("--------------------------\n");
		System.out.println("\nNOTE : REUSABLE SOFTWARE COMPONENTS SHOULD NOT BE INCLUDED IN THIS ESTIMATE\n");
		
		try
		{
			double ac = Actor.actor(actor);
			double uc = UseCase.use_case(useCase);
			double uucp = UUCP(ac,uc);
			double tf = TechFactor.tech_factor(Tfactor);
			double tcf = TCF(tf);
			double ucs = UCS(uucp,tcf);
			double efs = EFS.efs(Efactor);
			double ef = EF(efs);
			double ucp = UCP(ef,ucs);
			double mh = MH(ucp);
			double mhr = MHR(mh);
			double efr = EFR.efr();
			TMH(efr,mhr);	
		}
		catch (InputMismatchException e)
		{
			System.out.println("\nPlease insert number only!\n");
		}
	}
	
	
	public static double UUCP(double actor, double useCase)
	{
		System.out.println("\n>>>>>> Calculation for Unadjusted Use Case Points (UUCP) <<<<<<\n");
		
		double tuucp = actor + useCase;
		
		System.out.print("Total use UUCP = "+tuucp+"\n\n");
		
		return tuucp;
	}

	public static double TCF(double Tfactor)
	{
		System.out.println("\n>>>>>> Calculation for Technical Complexity Factor (TCF) <<<<<<\n");
		
		double tcf = (Tfactor * 0.01) + 0.6;
		
		System.out.print("Total technical complexity factor = "+tcf+"\n\n");
		
		return tcf;
	}
	
	public static double UCS(double UUCP, double TCF)
	{
		System.out.println("\n>>>>>> Calculation for Size of the Software (Use Case)) <<<<<<\n");
		
		double Use_Case_Size = UUCP * TCF;
		
		System.out.print("Total use case size = "+Use_Case_Size+"\n\n");
		
		return Use_Case_Size;
	}
	
	public static double EF(double total_Efactor)
	{
		System.out.println("\n>>>>>> Calculation for Experience Factor <<<<<<\n");
		
		double EF = (total_Efactor * (-0.03)) + 1.4;
		
		System.out.print("Total experience factor = "+EF+"\n\n");
		
		return EF;
	}
	
	public static double UCP (double EF,double Use_Case_Size)
	{
		System.out.println("\n>>>>>> Calculation for Use Case Points <<<<<<\n");
		
		double UCP = EF * Use_Case_Size;
		
		System.out.print("Use Case Points = "+UCP+"\n\n");
		
		return UCP;
	}

	public static double MH(double UCP)
	{	
		System.out.println("\n>>>>>> Calculation for Man-Hours <<<<<<\n");
		
		System.out.print("Insert the effort rate, 20 or 28 : ");
		int er = scan.nextInt();
		double total_man_hours = er * UCP;
		
		System.out.println("\nTotal man-hours = "+total_man_hours+"\n");
			
		return total_man_hours;
	}
	
	public static double MHR(double total_man_hours)
	{
		System.out.println("\n>>>>>> Calculation for Adjusting Man-Hours for Risk <<<<<<\n");

		System.out.print("Enter the estimate risk percentage : ");
		double estimate_percentage = scan.nextDouble();
		double estimate = estimate_percentage * 0.01;
		double adjusted_man_hours = total_man_hours * (1.0 + estimate);

		double roundOff1 = Math.round(adjusted_man_hours * 100.0) / 100.0;
		
		System.out.println("\nTotal adjusted man-hours = "+roundOff1+"\n");
		
		return roundOff1;
	}
	
	public static double TMH(double total_report, double adjusted_man_hours)
	{
		System.out.println("\n>>>>>> Calculation for Final Total Man-Hours <<<<<<\n");
		
		double total_man_hours_all = total_report + adjusted_man_hours;
		
		double roundOff = Math.round( total_man_hours_all * 100.0) / 100.0;
		
		System.out.println("Final total man-hours = "+roundOff);
		
		return roundOff;
	}
}