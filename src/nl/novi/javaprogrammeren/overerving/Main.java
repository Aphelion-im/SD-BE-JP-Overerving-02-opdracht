package nl.novi.javaprogrammeren.overerving;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Pablo", "male", "Chris", "Prince", "Garbage");
        Wolf wolf1 = new Wolf("Silas", "male", "Wolf Den", "Wednesday", "Zimbabwe", "Scott McCall");
        Cat cat1 = new Cat("Simba", "male", "Mufasa", "Brekkies", "European shorthair", true);
        Lion lion1 = new Lion("Mufasa", "male", "Pride's rock", "Thursday", "Nigeria", 12);
        Lion lion2 = new Lion("Simba", "male", "Pride's rock", "Thursday", "Nigeria", 12);
        Tiger tiger1 = new Tiger("Nala", "female", "Bengalese tigers", "Tuesday", "Nairobi");

        ArrayList<Zoo> zooAnimals = new ArrayList<>();

        zooAnimals.add(wolf1);
        zooAnimals.add(lion1);
        zooAnimals.add(tiger1);



        System.out.println("The following animals are in the Zoo:");
        for(Zoo name : zooAnimals) {
        System.out.println("- " + name.getName());
        }

        dog1.move();
        dog1.makeSound();
        dog1.eat("Dog meat");
        System.out.println(dog1.getName());

        wolf1.makeSound();
        cat1.makeSound();
        System.out.println(lion1.getNumberOfCubs());
        System.out.println(tiger1.getNameOfPaddock());

    }
}
