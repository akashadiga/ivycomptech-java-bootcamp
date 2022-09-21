package Day4.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

    public void demoDS() {

        List<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(8);
        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList.contains(6));
        System.out.println(myList.isEmpty());
        List<Integer> myList2 = Collections.unmodifiableList(myList);
        myList2.set(0,1);
        System.out.println(myList2);

        for(int i :myList)
            System.out.println(i);

    }
}
