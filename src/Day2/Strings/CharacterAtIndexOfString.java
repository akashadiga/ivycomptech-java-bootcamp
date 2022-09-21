package Day2.Strings;

import java.util.Scanner;

public class CharacterAtIndexOfString {
    static  char characterAtWhichIndex(String str, int index){
        return str.charAt(index);
    }
    public static void main(String[] args) {
        String str="asddf";
        int index= 2;
        System.out.println(characterAtWhichIndex(str,index));
    }
}
