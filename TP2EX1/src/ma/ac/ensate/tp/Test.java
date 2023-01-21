package ma.ac.ensate.tp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Etudiant youssef = new Etudiant(1234,"Youssef","Abidi");
        Etudiant leo = new Etudiant();
        Etudiant cr=new Etudiant("cr7");
        System.out.println("Veuiller completer les infos de l'etudiant saisi par constructor par default");
        System.out.println("code1 :");
        int code1 =sc.nextInt();
        sc.nextLine();
        System.out.println("nom1 :");
        String nom1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Prenom1 :");
        String prenom1 = sc.nextLine();
        System.out.println("Veuiller completer les infos de l'etudiant saisi par constructor pui a just le nom");
        System.out.println("code2 :");
        int code2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Prenom2 :");
        String prenom2 = sc.nextLine();
        leo.setCode(code1);
        leo.setNom(nom1);
        leo.setPrenom(prenom1);
        cr.setCode(code2);
        cr.setPrenom(prenom2);
        Etudiant ali =new Etudiant(cr);
        System.out.println(youssef.toString());
        System.out.println(leo.toString());
        System.out.println(cr.toString());
        System.out.println(ali.toString());
        sc.close();
    }
}
