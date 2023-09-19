package nl.novi.javaprogrammeren.overerving;

public class Dog extends Pet {

    public Dog(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String breed) {
        super(name, gender, nameOfOwner, favoriteFoodBrand, breed);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says Woof woof!");
    }
}
