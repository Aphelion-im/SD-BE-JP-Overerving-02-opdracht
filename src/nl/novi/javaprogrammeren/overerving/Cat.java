package nl.novi.javaprogrammeren.overerving;

public class Cat extends Pet {
    boolean isIndoorCat;

    public Cat(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String species, boolean isIndoorCat) {
        super(name, gender, nameOfOwner, favoriteFoodBrand, species);
        this.isIndoorCat = isIndoorCat;
    }

    public boolean isIndoorCat() {
        return isIndoorCat;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
