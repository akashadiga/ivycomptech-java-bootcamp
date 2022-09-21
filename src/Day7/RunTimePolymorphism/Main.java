package Day7.RunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Omnivores();
        Animal cow = new Herbivores();
        Animal lion = new Carnivores();
        dog.eat();
        cow.sleep();
        lion.eat();
        dog.sleep();
    }
}
