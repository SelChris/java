package package_v1;
import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Eingabeaufforderung <ja> oder <nein>:");
		 String answer = scan.nextLine();
		 if (answer.equals("ja")){
	         System.out.println("Geben sie 1. Zahl ein:");
			 int num1 = scan.nextInt();
			 System.out.println("Geben sie 2. Zahl ein:");
			 int num2 = scan.nextInt();
			 System.out.println("Geben sie 3. Zahl ein:");
			 int num3 = scan.nextInt();
			 System.out.println("Geben sie 4. Zahl ein:");
			 int num4 = scan.nextInt();
			 System.out.println("Geben sie 5. Zahl ein:");
			 int num5 = scan.nextInt();
			 int sum = num1 + num2 + num3 + num4 + num5;  
			 System.out.println("Gesammtsumme:" + sum );
	     } else if (answer.equals("nein")){
	        System.out.println("NOPE"); 
	     } 
		 scan.close();
	 }	
}

