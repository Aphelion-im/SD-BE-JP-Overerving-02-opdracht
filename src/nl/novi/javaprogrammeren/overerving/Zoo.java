package nl.novi.javaprogrammeren.overerving;

import java.util.ArrayList;

public abstract class Zoo extends Animal {

    String nameOfPaddock;
    String dayLastFed;
    String landOfOrigin;

    public Zoo(String name, String gender, String nameOfPaddock, String dayLastFed, String landOfOrigin) {
        super(name, gender);
        this.nameOfPaddock = nameOfPaddock;
        this.dayLastFed = dayLastFed;
        this.landOfOrigin = landOfOrigin;
    }

ArrayList<Animal> animals = new ArrayList<>();


    public String getNameOfPaddock() {
        return nameOfPaddock;
    }

    public String getDayLastFed() {
        return dayLastFed;
    }

    public String getLandOfOrigin() {
        return landOfOrigin;
    }

//    Kan addAnimal alleen in main?
//    public static void addAnimal(Animal animal) {
//        System.out.println("Test: " + animal);
//    }

// Lukt me niet om een print method te maken. Of kan dat alleen in main?
//    public static void printZooAnimals(Zoo animals) {
//        System.out.println("The following animals are in the Zoo:");
//        for(Zoo name : animals) {
//            System.out.println("- " + name.getName());
//        }
//    }

}