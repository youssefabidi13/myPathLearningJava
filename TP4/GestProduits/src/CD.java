public class CD extends Produit{
    private String titre;
    private String auteur;
    private  double prix;

    public CD(long id, String titre, String auteur, double prix) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }
    @Override
    public void imprimer(){
        System.out.println("CD [ Id : '" + super.getId() + "', '" + this.titre + "' de '" + this.auteur + "', pour un prix exceptionnel de : '" + this.prix + "' ]");
    }
}
