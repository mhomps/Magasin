
public class Essais {

	public static void main(String[] args) {
		System.out.println("Lancement du programme:");

		Produit podt= new Produit("Patates", 2);
		System.out.println(podt);

		Produit yaourt=new Produit("Yaourt", 3);
		System.out.println(yaourt);
		Produit tarte=new Produit("Tarte", 3);
		System.out.println(tarte);
		
		Commande commande =new Commande("Toto", 12);
		commande.ajouteCommande(new LigneDeCommande(yaourt, 6));
		System.out.println(commande);
		System.out.println("Fin du programme");
	}

}
