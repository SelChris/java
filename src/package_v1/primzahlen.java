package package_v1;
import java.util.Scanner;

public class primzahlen {

	public static void main(String[] args) {
		
			//int zahl = (int) (Math.random() * 2000000000 + 1);
			//System.out.print(zahl + "\n");	
		Scanner input = new Scanner(System.in);
	    System.out.print("Geben Sie eine Zahl an: ");
	    int zahl = input.nextInt();
	    boolean g = zahl%2==0;
		int t = zahl / zahl;
		boolean f = zahl%3==0;
			
		if (zahl >= 1 && g== true && f == true) {
			System.out.print(zahl + " ist eine Primzahl ");
		} else {
			System.out.print(zahl + " ist keine Primzahl");
		}
	input.close();
	}

}
