package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Zoo {
    String packName;

    public Wolf(String name, String gender, String nameOfPaddock, String dayLastFed, String landOfOrigin, String packName) {
        super(name, gender, nameOfPaddock, dayLastFed, landOfOrigin);
        this.packName = packName;
    }

    public String getPackName() {
        return packName;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says howl! howl!");
    }
}
