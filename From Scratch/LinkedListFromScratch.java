import java.util.*;

public class LinkedListFromScratch {
    public static void main(String[] args) {
        MyLinkedList<Integer> x = new MyLinkedList<>();
        for (int i=1; i<=50;i++)
            x.append(i*2);

        System.out.println(x.toString());



    }

}

class MyLinkedList<E> {
    Node<E> head = null;
    Node<E> current = null;
    Node<E> newNode;

    public void append(E x) {
        newNode = new Node<E>(x);

        if (head == null) {
            // for very first mode
            head = newNode;
        } else {
            current = head;
            // track down to tail node
            while (current.next != null)
                current = current.next;
            // add in the new node
            current.next = newNode;
        }
    }

    public String toString(){
        String s="";
        current = head;
        if (current.data!=null) {
            do {
                s += current.data.toString()+",";
                current = current.next;
            } while (current.next != null);
        }
        return(s);
    }
}


    class Node<E> {
        E data;
        Node<E> next = null; // to store the next location where data is at
        Node (E data) {
            this.data = data;// to store the data
        }
    }