package Day2.Strings;

public class StringIgnoreCase {
    public static void main(String[] args) {
        String str1 = "akash adiga";
        String str2 = "Ivy comptech";
        String str3 = "a simple string";
        boolean res1 = str1.equalsIgnoreCase(str2);
        boolean res2 = str1.equalsIgnoreCase(str3);
        System.out.println(str1 +"equals" + str2 +" " +res1);
        System.out.println(str1 +"equals" + str3 +" " +res2);
    }
}
