import java.util.ArrayList;

public class Commande {
	
	private ArrayList<LigneDeCommande> commandes;
	private String nom;
	private int numero;
	
	public Commande(String nom, int num) {
		this.commandes=new ArrayList<>();
		this.nom=nom;
		this.numero=num;
	}
	
	public void ajouteCommande(LigneDeCommande com) {
		this.commandes.add(com);
	}

	@Override
	public String toString() {
		return "Commande [commandes=" + commandes + ", nom=" + nom + ", numero=" + numero + "]";
	}
	
	

}
