import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        System.out.println("This app checks if the entered year is leap year.");

        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();

        if (year%4==0) {
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not leap year");
            System.out.println("Please enter another year");

            Scanner sc2 = new Scanner(System.in);
            int second_year= sc2.nextInt();
        }
    }
}
