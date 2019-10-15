package priemzahlen;
import java.util.Scanner;

	public class priemzahlen {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Geben Sie eine Zahl an: ");
	    int zahl = input.nextInt();
	    
	    boolean check1;
	
			
		if (zahl%2 == 0 || zahl%3 == 0 || zahl%5 == 0) 
			check1 = false;
			else {
			check1 = true;
			}
			if (zahl == 2 || zahl == 3 || zahl == 5)
				check1 = true;
		
		if (check1 == false)
			System.out.print(zahl + " ist keine Primzahl ");
		else
			System.out.print(zahl + " ist eine Primzahl");
	
	input.close();
	}

}