public class L7E2_FibonacciSeq {
    public static void main(String[] args) {
        System.out.println(FibNumFrom (34,55, 5));

        }


    public static int FibNumFrom (int first, int second, int n){
        int newsecond;
        newsecond = first + second;
        if (n==0){
            return(first);
        }
        n--;
        return (FibNumFrom (second,newsecond, n));

    }


}
