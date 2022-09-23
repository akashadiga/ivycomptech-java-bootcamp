package Day8.ExceptionTeach;

import Day8.ExceptionTeach.UserDefinedException;

public class ExceptionTeach {
    //Exception is an unwanted or unexpected event that happen at runtime
    //java.lang.Object -> java.lang.Throwable -> java.lang.Exception

    public static void checkedVsUnchecked(){
        try {
            Class.forName("com.mcnz.Example");
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found.");
        }

        String input = null;
        input.length(); // throws an unchecked exception


    }

    public static void main(String[] args) {
        try {
            int a = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally {
            System.out.println("rest of the code");
        }





        validate((int)10.3);




        try
        {
            // throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }






    public static void validate(int age) {
        if(age<18) {
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}