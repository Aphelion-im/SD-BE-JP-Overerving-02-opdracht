package nl.novi.javaprogrammeren.overerving;

public abstract class Pet extends Animal {
    private final String breed;
    private String nameOfOwner;
    private String favoriteFoodBrand;

    // Protected: An access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses. (Not in superclass!)
    protected Pet(String name, String gender, String nameOfOwner, String favoriteFoodBrand, String breed) {
        super(name, gender);
        this.nameOfOwner = nameOfOwner;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public String getSpecies() {
        return breed;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }
}
