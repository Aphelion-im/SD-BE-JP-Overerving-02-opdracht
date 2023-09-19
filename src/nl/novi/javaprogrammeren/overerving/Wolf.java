package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Wild {
    private String packName;

    public Wolf(String name, String gender, String nameOfPaddock, String landOfOrigin, String packName, String scottMcCall) {
        super(name, gender, nameOfPaddock, landOfOrigin);
        this.packName = packName;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says howl! howl!");
    }
}
