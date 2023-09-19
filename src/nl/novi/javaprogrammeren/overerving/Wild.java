package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;
import java.util.ArrayList;

public abstract class Wild extends Animal {

    private String nameOfPaddock; // Warning: Field 'nameOfPaddock' may be final. → Er is geen Setter aanwezig voor dit veld
    private String landOfOrigin;
    private DayOfWeek dayLastFed; // Niet in de constructor

    // Protected: An access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses. (Not in superclass!)
    protected Wild(String name, String gender, String nameOfPaddock, String landOfOrigin) {
        super(name, gender);
        this.nameOfPaddock = nameOfPaddock;
        this.landOfOrigin = landOfOrigin;
    }

    // Getters/Accessors
    public String getNameOfPaddock() {
        return nameOfPaddock;
    }

    public DayOfWeek getDayLastFed() {
        return dayLastFed;
    }

    public String getLandOfOrigin() {
        return landOfOrigin;
    }

    // Setters/Mutators
    public void setNameOfPaddock(String nameOfPaddock) {
        this.nameOfPaddock = nameOfPaddock;
    }

    public void setLandOfOrigin(String landOfOrigin) {
        this.landOfOrigin = landOfOrigin;
    }

    public void setDayLastFed(DayOfWeek dayLastFed) {
        this.dayLastFed = dayLastFed;
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