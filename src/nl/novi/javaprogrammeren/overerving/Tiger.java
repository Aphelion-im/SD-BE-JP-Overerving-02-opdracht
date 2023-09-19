package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Zoo {
    int numberOfStripes;

    public Tiger(String name, String gender, String nameOfPaddock, String dayLastFed, String landOfOrigin) {
        super(name, gender, nameOfPaddock, dayLastFed, landOfOrigin);
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says Rawrrrrr!");
    }
}
