package Day4.ArrayList;

import java.util.*;

public class ArrayListAssignment {
    private ArrayList<String> arr= new ArrayList<>();
    ArrayListAssignment(){
        this.arr.add("Red");
        this.arr.add("Blue");
        this.arr.add("Green");
        this.arr.add("yellow");
    }

    void inserAtFirst(String str){
        this.arr.add(0,str);
    }
    String getAtIndex(int index){
        return this.arr.get(index);
    }
    void insertElementAtIndex(int index,String ele){
        this.arr.set(index,ele);
    }
    String removeFromThrid(){
        if(this.arr.size()>3){
            return this.arr.remove(3);
        }
        return "-1";
    }
    int searchingAnElement(String ele){
        return  this.arr.indexOf(ele);
    }
    void emptyArray() {
        this.arr.clear();
    }
    boolean compareArray(ArrayList a,ArrayList b){

        return  a.equals(b);
    }


    void joining(ArrayList a,ArrayList b){
        a.addAll(b);
    }

    boolean isArrayEmpty(ArrayList a) {

        return a.isEmpty();
    }
    void Swap(ArrayList a,int idx1,int idx2){
        Collections.swap(a,idx1,idx2);
    }
}
