package exercice3Tp4;

import exercice3Tp4.Employe;

public class Main {
    public static void main(String[] args) {
        //test personnel
        Personnel personnel = new Personnel();
        Employe a = new Employe("amigo",12,1,1234);
        Employe d = new Employe("Anas",121,1,2334);
        Employe s = new Employe("taha",1212,1,2242);
        Employe z = new Employe("abidi",111,1,3131);
        personnel.ajouterEmploye(a);
        personnel.ajouterEmploye(d);
        personnel.ajouterEmploye(s);
        personnel.ajouterEmploye(z);
        personnel.calculerSommeSalaire();
        personnel.afficherTousLesEmployes();
        //test subordinates
        Employe[] subordinates = new Employe[5];
        subordinates[0] = new Employe("Anas",1,1,1234);
        subordinates[1]= new Employe("Reda",2,2,1234);
        subordinates[2]= new Employe("Alves",3,3,1234);
        subordinates[3]= new Employe("Ali",4,4,1234);
        subordinates[4]= new Employe("Mohamed",5,5,1234);
        Responsable Youssef = new Responsable("Youssef",6,6,5000,subordinates);
        Employe[] subordinates1 = new Employe[1];
        subordinates1[0] =Youssef;
        personnel.afficherTousLesEmployes();
        Responsable Mostapha = new Responsable("Mostapha",7,7,7000,subordinates1);
        Youssef.displayDirectSubordinates();
        Youssef.displayAllSubordinates();
        Mostapha.displayDirectSubordinates();
        Mostapha.displayAllSubordinates();
    }
}
