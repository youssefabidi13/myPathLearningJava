package exercice3Tp5;

public class Main {

    public static void main(String[] args) {

        Ecole.openConnection();
        //Afficher les étudiants de la filière n°2
        System.out.println("Afficher les étudiants de la filière n°2");
        Ecole.afficherEtudiantsFilière(2);
        System.out.println();

        //Afficher tous les étudiants
        System.out.println("Afficher tous les étudiants");
        Ecole.afficherTousEtudiants();
        System.out.println();

        //Modifier le prénom de l'étudiant n°2
        System.out.println("Modifier le prénom de l'étudiant n°2");
        Ecole.modifierPrenomEtudiant(2, "Ahmed");
        Ecole.afficherTousEtudiants();
        System.out.println();

        //Ajouter un nouvel étudiant dans la filière n°3
        System.out.println("Ajouter un nouvel étudiant dans la filière n°3");
        Ecole.ajouterEtudiant("KAHOUL", "Yasmine", 3);
        Ecole.afficherTousEtudiants();
        System.out.println();

        //Supprimer l'étudiant n°10
        System.out.println("Supprimer l'étudiant n°10");
        Ecole.supprimerEtudiant(10);
        Ecole.afficherTousEtudiants();
    }

}