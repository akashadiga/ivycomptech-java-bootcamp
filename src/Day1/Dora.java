package Day1;

public class Dora {
    public void mangoTreeOrNot(int coloum, int row, int number){
        if (number < coloum || number % coloum == 0 || number % coloum == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }

}
