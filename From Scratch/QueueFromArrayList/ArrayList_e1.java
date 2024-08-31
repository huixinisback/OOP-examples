import java.util.ArrayList;
public class ArrayList_e1 {
  public static void main(String[] args) {
    MyQueue<Integer> q1 = new MyQueue<>();
    MyQueue<String> q2 = new MyQueue<>();
    q1.addToRear(111);
    q1.addToRear(222);
    q1.addToRear(333);
    
    q2.addToRear("SP");
    String ss = q2.popFromFront();
    q1.popFromFront();
    System.out.println (q1.size());
    System.out.println (q2.size());
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
      //designed to return the object that was removed
      return (obj);
    }else{
      //there are no more objects in the queue, hence return null
      return (null);
    }
    
  }
  
  int size(){
    return a.size();
  }

  
}

