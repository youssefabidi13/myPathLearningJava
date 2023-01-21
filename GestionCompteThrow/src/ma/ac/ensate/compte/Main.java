package ma.ac.ensate.compte;

import java.util.Scanner;

public class Main {
    static Compte[] tabDuCompte = new Compte[100];

    public static void AjouterUnTabDeCompte() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veullez saisir la taille du tableau");
        int taille = scanner.nextInt();
        tabDuCompte = new Compte[taille];

        for (int i = 0; i < tabDuCompte.length; i++) {
            System.out.println("Please enter your information about your account " + i);
            System.out.println("numero du compte " + i);
            int nbCpt = scanner.nextInt();
            scanner.nextLine();
            System.out.println("titulaire du compte " + i);
            String titulaireCpt = scanner.nextLine();
            System.out.println("solde du compte " + i);
            double soldeCpt = scanner.nextDouble();
            scanner.nextLine();
            tabDuCompte[i] = new Compte(nbCpt, titulaireCpt, soldeCpt);
        }
    }

    public static void AfficherTousLesComptes(Compte[] tabDuCompte) {
        for (Compte count : tabDuCompte) {
            System.out.println(count.toString());
        }
    }

    public static void AfficherLeComptesSup(Compte[] tabDuCompte) {
        for (Compte count : tabDuCompte) {
            if (count.getSolde() >= 9000) {
                System.out.println(count.toString());
            }else{
                System.out.println("There is no account sup than 9000");
            }
        }
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a - Ajouter un tableau de comptes");
        System.out.println("b - Afficher tous les comptes");
        System.out.println("c - Afficher les comptes qui ont un montant >= 9000");
        System.out.println("d - Retirer un montant");
        System.out.println("e - vireVers un montant");
        System.out.println("f - Quitter le programme");
        System.out.println("Show an option : ");
        String choise = sc.nextLine();
        switch (choise) {
            case "a":
                AjouterUnTabDeCompte();
                Menu();
            case "b":
                AfficherTousLesComptes(tabDuCompte);
                Menu();
            case "c":
                AfficherLeComptesSup(tabDuCompte);
                Menu();
            case "d":
                Compte cptAbidi = new Compte(1,"youssefAbidi",20000);
                try{
                    cptAbidi.retirer(1500);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                System.out.println(cptAbidi.toString());
                System.exit(0);
            case "e":
                Compte cptAhmed = new Compte(1,"Ahmed",20000);
                Compte cptZakaria = new Compte(2,"Zakariya",1000000);
                try{
                    cptZakaria.viverVers(100000000,cptAhmed);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                System.exit(0);
            case "f":
                System.exit(0);
            default:
                Menu();
                break;
        }
    }

    public static void main(String[] args) {
        Menu();

    }
}
