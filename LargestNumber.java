public class LargestNumber {

    static String FindLargestNumber(int a, int b, int c)
    {
          if (a>=b & a>=c) {
            String result = " a is greater";
            return result;
          }
          else if (b>=a & b>=c) {
            String result = " b is greater";
            return result;
          }
          else{
            String result = " c is greater";
            return result;
          }
    }
    public static void main(String[] args) {
        String result = FindLargestNumber(3,4,1);
        System.out.println( result );
    }
}
