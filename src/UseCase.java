import java.util.Scanner;

public class UseCase 
{
	static Scanner scan = new Scanner(System.in);
	
	public static double use_case(double total_use_case)
	{
		System.out.println("\n>>>>>> Calculation for Use Case <<<<<<\n");
		
		System.out.println("Simple use case has 3 or fewer transactions");
		System.out.print("Insert quantity of simple use case (IF HAVE) : ");
		int quantity_insert_UC1 = scan.nextInt();
		
		System.out.println("\nAverage use case has 4 to 7 transactions");
		System.out.print("Insert quantity of average use case (IF HAVE) : ");
		int quantity_insert_UC2 = scan.nextInt();
		
		System.out.println("\nComplex use case has more than 7 transactions.");
		System.out.print("Insert quantity of complex use case (IF HAVE) : ");
		int quantity_insert_UC3 = scan.nextInt();

		int simpleUC = quantity_insert_UC1 * 5;
		int averageUC = quantity_insert_UC2 * 10;
		int complexUC = quantity_insert_UC3 * 15;

		total_use_case = simpleUC + averageUC + complexUC;
		
		System.out.print("\nTotal use case value = "+total_use_case+"\n\n");
		
		return total_use_case;
	}
}
