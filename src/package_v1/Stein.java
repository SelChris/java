package package_v1;
import java.util.Scanner;

public class Stein {
	public static void main(String[] args) {
	double z; //zeit
	double e; //def entfernung
	double f = (double)9.81;
	Scanner incertd = new Scanner(System.in);
    System.out.print("Geben Sie die Anzahl der Sekunden ein: ");
    z = incertd.nextDouble();
    e = (0.5) * f * Math.pow(z, 2);
    System.out.println("Die Entfernung e betraegt: " + e +" Meter");
    incertd.close();
	}
}