public class Livre extends Produit{
    private String titre;
    private String auteur;
    private String isbn;

    public Livre(long id, String titre, String auteur, String isbn) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }
    @Override
    public void imprimer(){
        System.out.println("Livre [ ID : "+super.getId()+", '"+this.titre+"' de '"+this.auteur+"' (ISBN : "+this.isbn+") ]");
    }
}
