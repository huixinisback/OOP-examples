import java.util.*;

public class Set_MapClassesInJava {
    public static void main(String[] args) {
      //LinkedHAshSet
      System.out.println("LinkedHashSet");;
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add(123);
        a.add(45);
        a.add(9);
        a.add(3210);
        a.add(9);//no duplicates
        Iterator it = a.iterator();
        while (it.hasNext()) {  
            System.out.println(it.next());//unsorted, as it was entered
        }
      //TreeSet
      System.out.println("TreeSet");
      TreeSet<Integer> b = new TreeSet<>();
       b.add(123);
       b.add(45);
       b.add(9);
       b.add(3210);
       b.add(9);//no duplicates
       TreeSet<Integer> c = new TreeSet<>(b);
       c.forEach((x)->System.out.println(x));//sorted ascending order

      //HashMap
      System.out.println("HashMap");
      HashMap<String,String> d = new HashMap<>();
       d.put("EEE","ElectricalElectronics Engineering");
       d.put("DE", "Digital Electronics");
       d.put("new module", null);
       d.forEach((abbr,fullname)->System.out.println(abbr+"==>" +fullname));//sorted by key (ASCI value and length of String)

      
       System.out.println(d.get("DE"));
        //TreeMap
      System.out.println("TreeMap");
       TreeMap<Integer,String> e = new TreeMap<>();
       e.put(7,"Electrical Electronics Engineering");
       e.put(2, "Engineering Maths");
       e.put(1, "Sports for Life");
       e.put(1, "Engineering Maths");// replacing the earlier value
       e.forEach((id,fullname)->System.out.println(id +"==>" +fullname));

      
    }
}
