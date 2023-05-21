public class Produit {

    private String libelle;
    private int prix;

    public Produit(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }
}
