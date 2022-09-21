package Day7.Money;

import Day7.Money.Money;

public class Main {
    public static void main(String[] args) {
        Money tenRupees = new Money(10);
        Money anotherTenRupees = new Money(10);
        System.out.println(tenRupees.equals(tenRupees));
        System.out.println(tenRupees.equals(anotherTenRupees));
        System.out.println(tenRupees.hashCode());
        System.out.println(anotherTenRupees.hashCode());
        Money fiveeuros = new Money(5);
        Money twoeuros = new Money(2);
        Money seveneuros = new Money(7);
        System.out.println((fiveeuros.sum(twoeuros)).equals(seveneuros));
    }
}
