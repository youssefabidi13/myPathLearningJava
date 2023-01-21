import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utilisateur utilisateur1  =new Utilisateur(1,"youssef abidi",10000,"youssef13","azerty123");
        Utilisateur utilisateur2 =new Utilisateur(2,"soufian amrabat",10000,"souf13","azerty1");
        Utilisateur utilisateur3 =new Utilisateur(3,"leo",15000,"leo13","arty123");
        Utilisateur[] tableauUser = {utilisateur1,utilisateur2,utilisateur3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre login");
        Utilisateur utilisateurTest = new Utilisateur();
        String log= sc.nextLine();
        utilisateurTest.setLogin(log);
        System.out.println("Entrer votre password");
        String pwd= sc.nextLine();
        utilisateurTest.setPassword(pwd);
        sc.close();
        boolean isAuthenticated = false;
        for (int i = 0; i < tableauUser.length; i++) {
            if (log.equals(tableauUser[i].getLogin()) && pwd.equals(tableauUser[i].getPassword())) {
                isAuthenticated = true;
                System.out.println("Authentification réussie :)");
                tableauUser[i].AfficheUtilisateur();
                break;
            }
        }
        if (!isAuthenticated) {
            System.out.println("Echec d'authentification ( : !");
        }
    }
}
