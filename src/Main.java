import Day5.Student;
import Day5.addition.Adder;
import Day6.*;
import Day6.ipl.Csk;
import Day6.ipl.IplTeam;
import Day6.ipl.Klp;
import Day6.ipl.Rcb;
import Day6.inheritance.Father;
import Day6.inheritance.GrandFather;
import Day6.inheritance.Son;

public class Main {
    public static void main(String[] args) {
        Student student= new Student();
        student.setAge(12);
        Adder sum= new Adder();
        System.out.println( sum.getClass()+" super class is "+ sum.getClass().getSuperclass());
        System.out.println(sum.add(1,2));
        FindingArea areaObject = new FindingArea(2);
        areaObject.area();
        areaObject.area(1);
        IplTeam csk = new Csk();
        IplTeam rcb = new Rcb();
        IplTeam kpl = new Klp();
        rcb.tournamentWonBy();
        csk.tournamentWonBy();
        kpl.tournamentWonBy();
        GrandFather grandfather = new GrandFather();
        GrandFather father = new Father();
        GrandFather son = new Son();
        grandfather.swim();
        father.swim();
        son.swim();

    }
}