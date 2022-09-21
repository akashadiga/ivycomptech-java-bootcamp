package Day6;

public class FindingArea {
    private int length;

    public FindingArea(int length) {
        this.length = length;
    }
    public void area(){
        System.out.println("Area of circle is "+ Math.PI*length*length);
    }
    public void area(int length){
        System.out.println("Area of square is "+ length*length);
    }

}
