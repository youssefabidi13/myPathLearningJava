import java.util.Scanner;

public class CountWordsAndCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase: ");
        String phrase = scanner.nextLine();

        int numWords = phrase.split(" ").length;
        int numChars = phrase.length();

        System.out.println("Nombre de mots: " + numWords);
        System.out.println("Nombre de caractères: " + numChars);
    }

}