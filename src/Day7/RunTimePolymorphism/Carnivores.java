package Day7.RunTimePolymorphism;

import Day7.RunTimePolymorphism.Animal;

public class Carnivores implements Animal {
    @Override
    public void eat() {
        System.out.println("we eat animals");

    }

    @Override
    public void sleep() {
        System.out.println("we are sleeping");
    }
}
