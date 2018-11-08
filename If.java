package package_v1;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		String a; //Artikel
		double p; //Preis
		double v; //Versandskosten einzeln
		double g; //gesammt
		double e; //expressversand
		double x; //expresszuschlag
		double vx; //versandkosten + expresszuschlag
		x = 0;
		
		Scanner incertd = new Scanner(System.in);
		System.out.print("Geben Sie den Artikel ein:");
		a = incertd.nextLine();
		System.out.print("Geben Sie den Preis ein:");
		p = incertd.nextDouble();
		System.out.print("Expressversand (0=nein, 1=ja):");
		e = incertd.nextDouble();
		
		if (p < 10) {
			if(e == 1) {
				x = 5;
			}
			v = 2;
			vx = v+x;
			g = v + p + x;
				System.out.println(" \n Rechnung \n  Artikel:"+ a +" \n  Versand:"+ vx +" \n  Gesamt: "+ g +"\n");
			} else if (p >= 10) {
			if(e == 1) {
					x = 5;
				}
				v = 3;
				vx = v+x;
				g = v + p + x;
				System.out.println(" \n Rechnung \n  Artikel:"+ a +" \n  Versand:"+ vx +" \n  Gesamt: "+ g +"\n");
		}
		incertd.close();
	}
}
