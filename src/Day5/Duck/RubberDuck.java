package Day5.Duck;

public class RubberDuck implements Noiseable,Squeezable{
    @Override
    public void makeNoise() {
        System.out.println("noice making");
    }

    @Override
    public void squeez() {
        System.out.println("squeezing");
    }
}
