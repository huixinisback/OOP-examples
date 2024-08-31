public class L7E1_BinaryConverter {
    public static void main(String[] args) {
        System.out.println(binaryDivide(29));
    }

    public static int binaryDivide(int n) {
        int binary = n%2;
        n=n/2;
        int returnValue;
        if(n>0){
           // System.out.println(n);
           return (10*binaryDivide(n)+binary) ;// 10* MSB + current "LSB" so it will " add the current one "
        }
        return binary;// MSB the most nested function will use this and exit out from the nest

    }


}
