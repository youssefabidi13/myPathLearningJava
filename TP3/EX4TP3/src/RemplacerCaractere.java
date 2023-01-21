import java.util.Scanner;

public class RemplacerCaractere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une chaîne de caractères : ");
        String chaine = sc.nextLine();

        System.out.print("Entrer le caractère à remplacer : ");
        char char2 = sc.next().charAt(0);

        System.out.print("Entrer le caractère de remplacement : ");
        char char1 = sc.next().charAt(0);

        String resultat = chaine.replace(char2, char1);

        System.out.println("Résultat : " + resultat);
    }
}