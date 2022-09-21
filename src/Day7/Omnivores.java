package Day7;

import Day7.RunTimePolymorphism.Animal;

public class Omnivores implements Animal {
    @Override
    public void eat() {
        System.out.println("we eat plants and animals");
    }

    @Override
    public void sleep() {
        System.out.println("we are sleeping");
    }
}
