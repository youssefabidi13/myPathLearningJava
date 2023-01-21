package exercice3Tp5;

import java.sql.*;

public class Ecole {

    private static Connection connexion;

    // 1) D’ouvrir une connexion vers la base de données mon mot de pass de base de donnée est "toor"
    public static void openConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/ecole","root","toor");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2) L'affichage des étudiants d'une filière.
    public static void afficherEtudiantsFilière(int numFiliere) {
        try {
            String query = "SELECT nomEtu, prenomEtu FROM Etudiant WHERE numFiliere=" + numFiliere;
            Statement stmt = connexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("nomEtu") + " " + rs.getString("prenomEtu"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3) L'affichage de l'ensemble des étudiants (toutes les filières).
    public static void afficherTousEtudiants() {
        try {
            String query = "SELECT nomEtu, prenomEtu, numFiliere FROM Etudiant";
            Statement stmt = connexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("nomEtu") + " " + rs.getString("prenomEtu") + " (Filière n°" + rs.getString("numFiliere") + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4) La modification du prénom d'un étudiant.
    public static void modifierPrenomEtudiant(int idEtu, String prenomEtu) {
        try {
            String query = "UPDATE Etudiant SET prenomEtu=? WHERE idEtu=?";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, prenomEtu);
            stmt.setInt(2, idEtu);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 5) L'ajout d'un nouvel étudiant dans une certaine filière.
    public static void ajouterEtudiant(String nomEtu, String prenomEtu, int numFiliere) {
        try {
            String query = "INSERT INTO Etudiant(nomEtu, prenomEtu, numFiliere) VALUES (?,?,?)";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setString(1, nomEtu);
            stmt.setString(2, prenomEtu);
            stmt.setInt(3, numFiliere);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 6) La suppression d'un étudiant d'une filière donnée.
    public static void supprimerEtudiant(int idEtu) {
        try {
            String query = "DELETE FROM Etudiant WHERE idEtu=?";
            PreparedStatement stmt = connexion.prepareStatement(query);
            stmt.setInt(1, idEtu);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
