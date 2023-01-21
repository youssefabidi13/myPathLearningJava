import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaine de charactere");
        String chaine =scanner.nextLine();
        int counter = 0;
        for (int i = 0;i<chaine.length();i++){
            counter++;
        }
        System.out.println(counter);
        chaine = chaine.substring(0, 1).toUpperCase() + chaine.substring(1);
        System.out.println(chaine);
        scanner.close();
    }
}
