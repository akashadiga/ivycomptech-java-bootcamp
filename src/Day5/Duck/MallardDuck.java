package Day5.Duck;

public class MallardDuck implements Flyable,Swimable,Noiseable,Walkable {

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("noice making");
    }

    @Override
    public void swim() {
        System.out.println("swiming");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}
