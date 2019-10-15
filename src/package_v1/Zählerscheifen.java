package package_v1;
import java.util.Scanner;

public class Zählerscheifen {

	public static void main(String[] args) {
		int b = 0;
		int n = 0;
		Scanner incertd = new Scanner(System.in);
		System.out.print("Anzahl für die Spalten bzw. Zeilen des Zahlenquadrats:");
		b = incertd.nextInt();
		for(int i = 1; i<=b; i++) { //horizontal
			 for(int j = 0; j < b; j++) {
				n = n + 1;
				 System.out.print(n + " ");
			 		}
	    System.out.println("\n");
				}
		incertd.close();
           	}
}
