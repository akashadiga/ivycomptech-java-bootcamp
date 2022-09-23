package Day8.TeachersBookProblem;

public class TeachersBookProblem {
    public int pageCount(int n, int p){
        if(p>n)
            throw new IllegalArgumentException("Not a valid page number, give the number in the range of the book");
        if((p%2)==0)
            return p/2;
        else
            return (p/2)+1;
        }
}