import java.util.*;

public class ArrayListFromScratch {
    public static void main(String[] args) {
        MyArrayList<Integer> x = new MyArrayList<>();
        for (int i=1; i<=50;i++)
            x.add(i*2);
        for (int i=10; i<15;i++)
            System.out.println(x.get(i));
    }

}

class MyArrayList<E> {
    int INITIAL_CAPACITY =10;
    E a[] = (E[]) new Object[INITIAL_CAPACITY];

    void add (E  x){
        if (a[a.length - 1]==null){
            int i=0;
            while (a[i]!=null)
                i++;
            a[i]=x;
        }
        else  {// important to understand,
            // increase size by 10, basically purge the old one to make a new array that updates the size
            int originalSize = a.length;
            int newSize = originalSize +10;
            E b[] = (E[]) new Object[newSize];
            b=Arrays.copyOf(a,newSize); //
            a=b;
            a[originalSize]=x;

        }
    }

    E get(int index){
        return(a[index]);   // good to have a check for the index to make sure it is valid
    }
}