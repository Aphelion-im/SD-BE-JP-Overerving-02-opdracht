package nl.novi.javaprogrammeren.overerving;

public class Lion extends Zoo {
    private final int numberOfCubs;

    public Lion(String name, String gender, String nameOfPaddock, String dayLastFed, String landOfOrigin, int numberOfCubs) {
        super(name, gender, nameOfPaddock, dayLastFed, landOfOrigin);
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
