public class L7E3_PrimeNumber {
    public static void main(String[] args) {
        System.out.println(PrimeNumberDectector(9,2));

        }


    public static boolean PrimeNumberDectector (int no, int divisible){
       int result = no%divisible;
       if(result !=0){
           divisible++;
           return PrimeNumberDectector(no, divisible);
       }else{
           if(divisible==no){
               System.out.println("It is a prime number");
               return true;
           }else{
               System.out.println("It is not a prime number");
               return false;
           }
       }
    }


}