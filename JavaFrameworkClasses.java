import java.util.*;

public class JavaFrameworkClasses {
    public static void main(String[] args) {
        List<Double> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        Vector<Double> c = new Vector<>();
        LinkedList<Double> d= new LinkedList<>();
        Stack<Double> e = new Stack<>();

        a.add(22.22);
        a.add(33.33);
        a.add(44.44);
        a.add(1,55.55);
        System.out.println(a);

        //using iteratior
        Iterator<Double> f = a.iterator();//diff type of usage to initiate Class => method
        while (f.hasNext()) {
            System.out.println ("element*10  : " + ((f.next())*10) );
        }

        ListIterator<Double> g = a.listIterator();
        g.hasPrevious();



        //size is manipulated while in the loop can give inacccurate results
        for(int i =0; i<a.size(); i++){
            System.out.println(a.remove(2));
        }
        System.out.println(a);
        //b is Array List
        b.add("AMK");
        b.add("CCK");
        b.add("PPP");
        //for each is sub interface of iterable, the place holder variable doesn't matter
        b.forEach(h->System.out.println(h.toUpperCase()));

        // e is Stack
        e.push(22.22);
        e.push(33.33);
        double y= e.pop();
        System.out.println(y);
        e.push(55.55);
        e.add(1,66.66);

        e.forEach(r-> System.out.println("element  : " + r));
        while(!e.isEmpty()){
            e.pop();
        }; //---> does the same thing as e.clear();

        /*cannot do for-each if we want to clear
        * */
        System.out.println(e);


    }


}