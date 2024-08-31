import java.util.*;

public class L6E1_ListTypeManipulation {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Sentosa");
        a1.add("Seletar Island");
        a1.add("Sisters Island");
        a1.add("St John Island");
        a1.add("Pulau Ubin");

        System.out.println(a1);
        a1.remove(2); //removes "Sisters Island"
        System.out.println(a1);
        System.out.println(a1.contains("Sentosa"));//see if element exist in arraylist (boolean return)
        //second arraylist
        ArrayList<String> a2 = (ArrayList<String>) a1.clone();
        System.out.println(a2); // [Sentosa, Seletar Island, St John Island, Pulau Ubin]

        a2.add(2, "Pulau Tekong");
        System.out.println(a2); // [Sentosa, Seletar Island, Pulau Tekong, St John Island, Pulau Ubin]


        ArrayList<String> a3 =(ArrayList<String>) a1.clone();
        ArrayList<String> a4 = (ArrayList<String>) a2.clone();
        a3.addAll(a4);//[Sentosa, Seletar Island, St John Island, Pulau Ubin, Sentosa, Seletar Island, Pulau Tekong, St John Island, Pulau Ubin]
        System.out.println(a3);
        a3 = (ArrayList<String>) a1.clone();
        a3.retainAll(a4); //[Sentosa, Seletar Island, St John Island, Pulau Ubin]
        System.out.println(a3);
        a3 = (ArrayList<String>) a1.clone();
        a4.removeAll(a3);// [Pulau Tekong]
        System.out.println(a4);

        /*
        if i dont use clone and i do this
        a2 = a1
        a1.remove(1);
        a1.remove(2);
        a1.size(); // 3
        a2.size(); // 3
        if i clone it and i do the remove
        a2 = (ArrayList<String>) a1.clone();
        a1.remove(1);
        a1.remove(2);
        a1.size(); // 3
        a2.size(); // 5
        //a2 will be unaffected as it is a copy and does not reference the same memory location as a1
         */

    }


}