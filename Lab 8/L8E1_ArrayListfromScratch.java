import java.util.*;

public class L8E1_ArrayListfromScratch {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1234);
        arrayList.add(234);
        arrayList.add(34);
        System.out.print(arrayList.size());


    }

}
class MyArrayList<E> {
    int INITIAL_CAPACITY =10;
    E a[] = (E[]) new Object[INITIAL_CAPACITY];
    void add (E x){
        if (a[a.length - 1]==null){
            int i=0;
            while (a[i]!=null)
                i++;
            a[i]=x;
        }
        else {
            // increase size by 10
            int originalSize = a.length;
            int newSize = originalSize +10;
            E b[] = (E[]) new Object[newSize];
            b=Arrays.copyOf(a,newSize);
            a=b;
            a[originalSize]=x;
        }
    }
    E get(int index){
        return(a[index]);
    }

    int size(){
        int i =0;
        while(a[i]!=null){
            i++;
        }
        return i;
    }
}
 