package package_v1;
import java.util.Scanner;

public class zahlenraten {
	public static void main(String[] args) {
		int eingabe = 0;
        int versuche = 1;
        int zufallZahl = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Ich denke an eine Zahl von 1 bis 10.\r\n" + 
				"Sie haben 3 Versuche diese Zahl zu erraten.\r\n" + 
				"Raten Sie!\r\n" + 
				"Versuch: 1\r\n" +
				"Ihre Zahl: \n");
				eingabe = s.nextInt();
				zufallZahl = (int) (Math.random() * 10 + 1);
				while(eingabe != zufallZahl){
	                System.out.println("Bitte eine Zahl eingeben: ");
	                eingabe = s.nextInt();
	                 
	                if(eingabe < 0 || eingabe > 10){
	                    System.out.print("Ungültige Eignabe. Bitte Eingabe wiederholen:");
	                }else if(eingabe < zufallZahl){
	                    System.out.print("Die gesuchte Zahl ist groesser!");
	                    versuche++;
	                }else if(eingabe > zufallZahl){
	                    System.out.print("Die gesuchte Zahl ist kleiner!");
	                    versuche++;
	                }else if(eingabe == zufallZahl){
	                    System.out.print("Sie haben die gesuchte Zahl gefunden!");
	                    System.out.print("Sie haben die " + zufallZahl + " in " + versuche + " Versuchen gefunden.");
	                    break;
	                }
	            }
		s.close();
	}

}
