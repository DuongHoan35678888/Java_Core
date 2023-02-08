package Overiding;

public class Cat extends Animals{

    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Toi thich an ca.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

}
