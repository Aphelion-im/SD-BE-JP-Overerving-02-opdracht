package nl.novi.javaprogrammeren.overerving;

public class Dog extends Pet {

    public Dog(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String species) {
        super(name, gender, nameOfOwner, favoriteFoodBrand, species);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says Woof woof!");
    }
}
