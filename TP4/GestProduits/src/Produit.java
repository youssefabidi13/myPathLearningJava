public class Produit {
    private long  id;
    public Produit(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void imprimer(){
        System.out.println("Produit [ID: "+id+"]");
    }
}
