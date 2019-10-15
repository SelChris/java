package package_v1;
import java.util.Scanner;

public class Radius {

	public static void main(String[] args) {
		int  R;
		double F;
		Scanner incertd = new Scanner(System.in);
        System.out.print("Geben Sie den Radius ein: ");
        R = incertd.nextInt();
        F = Math.PI * Math.pow(R, 2);
        System.out.println("Der Radius ist: "+ R +" Die Flaeche beträgt:" + F);
        incertd.close();
	}
}
