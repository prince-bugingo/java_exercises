import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class sides_of_a_triangle {
    public static void main(String[] args) {

        System.out.println("This app check if entered integers can make up a triangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("Enter third number");
        int c=sc.nextInt();
        if (a<1 || b <1|| c < 1) {
            System.out.println("No! The Entered digits can not create a rectangle");
        }
        else{
            System.out.println("Yes, Entered digits can create a rectangle");
        }
    }
}
