package nl.novi.javaprogrammeren.overerving;

public abstract class Pet extends Animal {
    String nameOfOwner;
    String favoriteFoodBrand;
    String species;

    public Pet(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String species) {
        super(name, gender);
        this.nameOfOwner = nameOfOwner;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.species = species;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public String getSpecies() {
        return species;
    }
}
