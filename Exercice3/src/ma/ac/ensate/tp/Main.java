package ma.ac.ensate.tp;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            int i,fact=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir la valeur du nombre");
            int number = sc.nextInt();
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("La factorielle de "+number+" est : "+fact);
    }
}