package ma.ac.ensate.tp;

import java.util.Scanner;

public class Main {
    public static void Ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir x : ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Veuillez saisir y : ");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum is x + y = " + (x+y) );
        System.out.println("The product is x * y = " + (x*y) );

    }
    public static void Ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur l du carré : ");
        int l = sc.nextInt();
        sc.nextLine();
        System.out.println("La surface  du carré est " + (l*l) );
    }
    public static void Ex3() {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la valeur du nombre");
        int number = sc.nextInt();
        if (number < 0){
            System.out.println("Veuillez saisir un nombre positive");
        } else if (number ==1 || number == 0) {
            System.out.println("La factorielle de "+number+" est : 0");
        }else{
            for(i=1;i<=number;i++){
                fact=fact*i;
                System.out.println("La factorielle de "+number+" est : "+fact);
            }
        }

    }
    public static void Ex4() {
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" ******* ");

    }
        public static void Menu (){
            System.out.println("1 - Somme et produit de deux entiers");
            System.out.println("2 - Surface d'un carré");
            System.out.println("3 - Factoriel d'un nombre");
            System.out.println("4 - Dessiner un triangle");
            System.out.println("5 - Quitter le programme");
            Scanner sc = new Scanner(System.in);
            System.out.println("Show an option : ");
            int x = sc.nextInt();
            switch (x){
                case 1 :
                    Ex1();
                    break;
                case 2 :
                    Ex2();
                    break;
                case 3 :
                    Ex3();
                    break;
                case 4 :
                    Ex4();
                    break;
                default:
                    Menu();
                    break;
            }
        }

        public static void main(String[] args) {
            Menu();
        }
}
