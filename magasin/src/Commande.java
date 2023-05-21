import java.util.ArrayList;

public class Commande {
	
	private ArrayList<Commande> commandes;
	private String nom;
	private int numero;
	
	public Commande(String nom, int num) {
		this.commandes=new ArrayList<>();
		this.nom=nom;
		this.numero=num;
	}
	
	public void ajouteCommande(Commande com) {
		this.commandes.add(com);
	}

	@Override
	public String toString() {
		return "Commande [commandes=" + commandes + ", nom=" + nom + ", numero=" + numero + "]";
	}
	
	

}
