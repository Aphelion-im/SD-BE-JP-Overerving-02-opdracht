package nl.novi.javaprogrammeren.overerving;

public class Cat extends Pet {
    boolean isIndoorCat;

    protected Cat(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String breed, boolean isIndoorCat) {
        super(name, gender, nameOfOwner, favoriteFoodBrand, breed);
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
