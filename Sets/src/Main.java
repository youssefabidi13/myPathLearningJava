import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // makat7afdex 3la trtib fl'affichage
        //Set<String> biblio = new HashSet<>();
        //linkedHashSet mrtba
        //Set<String> biblio = new LinkedHashSet<>();
        //treeSet ila bghit lordernormal
        Set<String> biblio = new TreeSet<>();
        Set<String> myBooks = new TreeSet<>();
        //System.out.println(biblio.isEmpty());
        myBooks.add("Sahih boukhari");
        myBooks.add(" muslim");
        myBooks.add("Hisn muslim");
        biblio.add("Sahih boukhari");
        biblio.add("Sahih muslim");
        biblio.add("Hisn muslim");
        biblio.add("La tahzan");
        biblio.add("Fath albari");
        biblio.add("Le dernier jour d'un condamne");
        biblio.add("Fath albari");
        for (String e:
             biblio) {
            System.out.println(e);
        }
        //System.out.println(biblio.isEmpty());
        //System.out.println(biblio.contains("La tahzan"));
        //System.out.println(biblio.equals(myBooks));
        System.out.println(biblio.retainAll(myBooks));
        biblio.retainAll(myBooks);
        for (String e:
                biblio) {
            System.out.println(e);
        }

    }
}
