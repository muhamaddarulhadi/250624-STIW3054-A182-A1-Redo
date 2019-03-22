
import java.util.Scanner;

public class Actor 
{
	static Scanner scan = new Scanner(System.in);

	public static double actor(double total_actor)
	{
		System.out.println("\n>>>>>> Calculation for Actor <<<<<<\n");
		
		System.out.println("Simple actor is another system with a defined Application Programming Interface (API)");
		System.out.print("Insert quantity of simple actor (IF HAVE) : ");
		int quantity_insert_actor1 = scan.nextInt();
		
		System.out.println("\nAverage actor is either another system that interacts through a protocol such as TCP/IP or it is a person interacting through a text-based interface");
		System.out.print("Insert quantity of average actor (IF HAVE) : ");
		int quantity_insert_actor2 = scan.nextInt();
		
		System.out.println("\ncomplex actor is a person interacting through a graphical user interface (GUI)");
		System.out.print("Insert quantity of complex actor (IF HAVE) : ");
		int quantity_insert_actor3 = scan.nextInt();
		
		int simpleA = quantity_insert_actor1 * 1;
		int averageA = quantity_insert_actor2 * 2;
		int complexA= quantity_insert_actor3 * 3;

		total_actor = simpleA + averageA + complexA;
		
		System.out.print("\nTotal actor value = "+total_actor+"\n\n");
		
		return total_actor;
	}
}
