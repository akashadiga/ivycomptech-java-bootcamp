package Day2.Strings;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "akash adiga";
        String str2 = "Ivy comptech";
        String str3 = "a simple string";
        boolean a = str1.equals(str2);
        boolean b = str1.equals(str3);
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + a);
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + b);


    }
}
