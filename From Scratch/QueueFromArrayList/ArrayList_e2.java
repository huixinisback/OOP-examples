import java.util.ArrayList;
public class ArrayList_e2 {
    public static void main(String[] args) {
      Integer a[] = {111,222,333,444,555};
      MyQueue<Integer> q1 = fromArrayToMyQueue(a);
      System.out.println(q1.size());
    }
}

class MyQueue<E>{
    ArrayList<E> a = new ArrayList<>();

    void addToRear(E newObj){
        a.add(newObj);
    }

    E popFromFront() {
        E obj;

        if (a.size()>0){
            obj = a.get(0);
            a.remove(0);
            return (obj);
        }else{
            return (null);
        }

    }

    int size(){
        return a.size();
    }

  public static <E> MyQueue<E> fromArrayToMyQueue(E arr[]){
      MyQueue<E> a = new MyQueue<>();
      for (int i = 0; i < arr.length; i++){
          a.addToRear(arr[i]);
      }
      return a;
  }
}

