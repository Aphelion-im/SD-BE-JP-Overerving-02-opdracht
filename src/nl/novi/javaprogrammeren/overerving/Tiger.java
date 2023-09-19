package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Wild {
    private int numberOfStripes; // Niet in constructor

    protected Tiger(String name, String gender, String nameOfPaddock, String landOfOrigin, String nairobi) {
        super(name, gender, nameOfPaddock, landOfOrigin);
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says Rawrrrrr!");
    }
}
