public class QueueFromScratch {
  public static void main(String[] args) {
    System.out.println("Hello world!");
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
        }
        return(null);
    }

    int size(){
        return a.size();
    }
}