package package_v1;

public class Plaetzchen {
	
	public String sorte;
	public String groesse;
	public String form;
	public String geschmack;

public void sorte(){
	System.out.println("Die sorte ist " + sorte);
}

public void groesse(){
	System.out.println("Die Ggröße ist " + groesse);
}

public void form(){
	System.out.println("Die Form ist " +  form);
}

public void geschmack(){
	System.out.println("Der geschmack ist " + geschmack);
}
	public static void main(String[] args) {

	Plaetzchen plaetzchen1 = new Plaetzchen();
	plaetzchen1.sorte = "Vanille";
	plaetzchen1.groesse = "3";
	plaetzchen1.form = "Rund";
	plaetzchen1.geschmack = "nicht gut";
	
	Plaetzchen plaetzchen2 = new Plaetzchen();
	plaetzchen2.sorte = "Schoko";
	plaetzchen2.groesse = "300";
	plaetzchen2.form =  "Rund";
	plaetzchen2.geschmack = "äzend";
	plaetzchen1.groesse();
	plaetzchen2.groesse();
	}

}
