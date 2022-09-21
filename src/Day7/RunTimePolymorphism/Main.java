package Day7.RunTimePolymorphism;

import Day7.Omnivores;
import Day7.RunTimePolymorphism.Animal;
import Day7.RunTimePolymorphism.Carnivores;
import Day7.RunTimePolymorphism.Herbivores;

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
