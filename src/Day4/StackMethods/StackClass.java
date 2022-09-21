package Day4.StackMethods;

import java.util.Stack;

public class StackClass {
public  void stack(){
    Stack<String>  myStack = new Stack<>();
    myStack.push("a");
    myStack.push("b");
    myStack.push("c");
    myStack.push("d");
    System.out.println(myStack);
    myStack.pop();
    System.out.println(myStack);
    for(String s: myStack)
        System.out.println(s);

    System.out.println(myStack.peek());
    System.out.println(myStack.search("c"));
    System.out.println(myStack.capacity());

}

}
