public class evenOddMethod {
    static  String  evenOdd(int x){
        if (x%2==0) {
        
            String result =  "It is Even";
            return result;
        }
        else{
            String result = "It is Odd";
            return result;
        }
    }
    public static void main(String[] args) {

           String result = evenOdd(8);
           System.out.println(result);
    }
}
