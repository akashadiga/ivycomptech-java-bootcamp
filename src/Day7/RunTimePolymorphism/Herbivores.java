package Day7.RunTimePolymorphism;

import Day7.RunTimePolymorphism.Animal;

public class Herbivores implements Animal {
    @Override
    public void eat() {
        System.out.println("We eat plants.");
    }

    @Override
    public void sleep() {
        System.out.println("we are sleeping");
    }
}
