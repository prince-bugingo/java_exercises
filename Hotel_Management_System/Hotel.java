
import java.util.Scanner;

public class hotel {
    static final Scanner scanner = new Scanner(System.in);
    static String customerName;
    static String roomType;
    static int numberOfNights;
    static double total;
    static double money;
    static double balance;

    static int single=50000;
    static int TheDouble=80000;
    static int  suite=120000;
    

static void bookRoom(){
    System.out.println("Tnter you Name");
    customerName = scanner.nextLine();

    System.out.println("Enter type of a room you want, there is 'single, Double and suite' ");
    roomType = scanner.nextLine();
}    
 
static void  stayDuration(){
    System.out.println("How many night are you gonna stay");
    numberOfNights = scanner.nextInt();

    if (numberOfNights<0) {
        do{
             System.out.println("Error! Please Enter number of nights more than 0");
            }
        while(numberOfNights<0);
}
}


static void calculateBill(){
    
    if (roomType == "single") {
        total = numberOfNights*single;
    }
    else if (roomType == "TheDouble") {
        total = numberOfNights*TheDouble;
    }
    else if (roomType == "suite") {
        total= numberOfNights*suite;
    }
    }

  static void payment(){
    System.out.println("Enter monet to process payment");
    money = scanner.nextDouble();
    balance = money - total;

    
  }
  static void displayReceipt(){
    //– show customer name, room type, nights, total amount, amount paid, balance.
    System.out.println("Customer Name :"+ customerName);
    System.out.println("Room Type :"+ roomType);
    System.out.println("Nights :"+ numberOfNights);
    System.out.println("Total Amount :"+ total);
    System.out.println("Amount paid :"+  money );
    System.out.println("Balance :"+ balance);

  }


    /*
     * Hotel Management System
Class Name: Hotel

Methods & User Input:

bookRoom() – ask the user:
Customer name (String)
Room type (single, double, suite) → assign predefined rates: single=50,000, double=80,000, suite=120,000

 stayDuration() – ask number of nights (integer > 0).

 calculateBill() – total = room rate × number of nights.

 payment() – ask for amount paid and calculate balance/change.

 displayReceipt() – show customer name, room type, nights, total amount, amount paid, balance.

Requirements:

Use Scanner for all inputs.

Static methods only.

Validate input: nights > 0, room type valid, payment ≥ total.
*/

public static void main(String[] args) {
    bookRoom();
    stayDuration();
    calculateBill();
    payment();
    displayReceipt();
}

}