public class StackFromScratch {
  public static void main(String[] args) {
 
  }

}

class MyStack<E> {
  int INITIAL_CAPACITY =10;
  E a[] = (E[]) new Object[INITIAL_CAPACITY];
  void push(E  x){
    if (a[a.length - 1]==null){
        int i=0;
        while (a[i]!=null)
            i++;
        a[i]=x;
    }
    else  {
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
void pop(){
    int i=0, last =0;
   while (a[i]!=null){
        last = i;
        if  (i== a.length)
           break;
        i++;
    }
    if (a[last]!= null)
      a[last] =null;x
}
public String toString (){
   String s="";
   int i=0, last =0;
   while ((a[i]!=null) && (i<a.length)) {
      s += a[i].toString() + " ";
      i++;
   }
   return(s);
 }
}