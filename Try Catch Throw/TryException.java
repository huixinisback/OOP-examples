public class TryException {
    public static void main(String[] args) {
        try {
            Object x = new Object();
            Integer y = (Integer) x;
            System.out.println( "Successful" );
        }catch (ClassCastException e){
            SystCem.out.println( "Unsuccessful\n" +e);
        }
    }

}