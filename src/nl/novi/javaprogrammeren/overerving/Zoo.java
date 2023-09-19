package nl.novi.javaprogrammeren.overerving;

import java.util.ArrayList;

public class Zoo {
    private String nameOfZoo;
    private static int numberOfAnimals;
    ArrayList<Wild> animalsList = new ArrayList<>();

    public Zoo(String nameOfZoo) {
        this.nameOfZoo = nameOfZoo;
    }

    public String getNameOfZoo() {
        return nameOfZoo;
    }

    public void setNameOfZoo(String nameOfZoo) {
        this.nameOfZoo = nameOfZoo;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void addWildAnimal(Wild animal) {
        System.out.println(animal.getName() + " has been added to " + this.nameOfZoo + "!");
        this.animalsList.add(animal);
        numberOfAnimals++;
    }

public void printAnimals(Zoo nameOfZoo) {
    System.out.println("Here is the list of animals in " + this.nameOfZoo + ":");
    System.out.println("There are " + this.getNumberOfAnimals() + " animals in " + this.nameOfZoo + ":");
    for(Wild name : animalsList) {
        System.out.println(name.getName());
    }
}

}
