import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal chien = new Chien();
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new Chien());
        animaux.add(new Chien());
        animaux.add(new Chat());
        animaux.add(new Chat());
        animaux.add(new Animal());
        for(Animal animal:animaux){
            animal.marcher();
        }
    }
}
