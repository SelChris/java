package package_v1;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int s; //startwert
		int e; //endwert
		int x; //s++
		
		
		Scanner incertd = new Scanner(System.in);
	    System.out.print("Startwert:");
	    s = incertd.nextInt();
	    System.out.println(s);
	    System.out.print("Endwert:");
	    e = incertd.nextInt();
	    System.out.println(e);
	    
	    while (s <= e) {
	    	x = s++;
	    	System.out.println(x);
	    }
	    incertd.close();
	}

}
