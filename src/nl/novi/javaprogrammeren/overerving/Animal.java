// Pets
// Dog
// Cat

// Specific:
// Lion int numberOfChildren;
// Tiger int numberOfStripes;
// Hond nameOfOwner, favoriteFoodBrand, species
// Kat nameOfOwner, favoriteFoodBrand, species, indoorOutdoor
// Wolf. packName

// Zoo animals: // extends ZooAnimal
// String nameOfPaddock; // Lion, tiger, Wolf - Vind ik een Zoo eigenschap
//    String dayLastFed; // Lion, tiger, Wolf
//    String landOfOrigin; // Lion, tiger, Wolf

package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {

    private String name; // Lion, tiger, Dog, Cat, Wolf
    private final String gender; // Lion, tiger, Dog, Cat, Wolf

    // Protected: An access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses. (Not in superclass!)
    protected Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(this.name + " has moved 0.25 meters.");
    }


    public void sleep() {
        System.out.println("The animal is going to sleep for 8 hours.");
    }

    public void eat(String food) {
        System.out.println(this.getName() + " is eating " + food);
    }

    // Dog of Cat moet een specifiek eigen geluid hebben. Vandaar @Overrule in de subclass
    public abstract void makeSound();

}


