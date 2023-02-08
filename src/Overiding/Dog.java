package Overiding;

public class Dog extends Animals{
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Toi thich an xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

}
