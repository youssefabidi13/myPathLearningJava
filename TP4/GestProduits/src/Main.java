public class Main {
    public static void main(String[] args) {
        CD cd1 =new CD(1,"game of thrones","george martin",123);
        cd1.imprimer();
        Livre livre1 =new Livre(2,"java","javaAuthor","azsq");
        livre1.imprimer();
        Produit prd1 =cd1;
        prd1.imprimer();
        Produit prd2 = livre1;
        prd2.imprimer();
        //on remarque que le principe de polymorphisme peut distinguer entre les objets par example il peut connaitre quelle methode imprimer à utiliser pour afficher le cd oubien le livre
    }
}
