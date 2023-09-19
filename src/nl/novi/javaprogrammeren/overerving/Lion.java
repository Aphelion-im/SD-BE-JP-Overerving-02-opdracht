package nl.novi.javaprogrammeren.overerving;

public class Lion extends Wild {
    private final int numberOfCubs;

    public Lion(String name, String gender, String nameOfPaddock, String landOfOrigin, int numberOfCubs) {
        super(name, gender, nameOfPaddock, landOfOrigin);
        this.numberOfCubs = numberOfCubs;
    }

    public int getNumberOfCubs() {
        return numberOfCubs;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says growl growl!");
    }
}
