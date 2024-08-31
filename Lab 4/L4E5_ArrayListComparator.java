
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Comparable;

public class L4E5_ArrayListComparator {
    public static void main(String[] args) {
        ArrayList<Character> a1 = new ArrayList( Arrays.asList('r','P','t','w'));
        System.out.println (getMaximum(a1));
        ArrayList<Float> a2 = new ArrayList( Arrays.asList(111f,-99f,888f,333f));
        System.out.println (getMaximum(a2));
        ArrayList<String> a3 = new ArrayList( Arrays.asList("SP","SG","EEE","DCPE"));
        System.out.println (getMaximum(a3));
    }
    //ArrayList<E> can take in any type of object 
    public static <E extends Comparable<E>> E getMaximum(ArrayList<E> x)
    {
        E max= x.get(0);
        for(int i = 1; i < x.size(); i++){
            if(x.get(i).compareTo(max) > 0){
                max = x.get(i);
            }
        }
        return max;
    }
}