import java.util.Scanner;

public class Libraly {
//static variables declaration
    static int  finePerDay=500;
    static String BookTitle;
    static int dayoverdue;
    static int totalFine;
    static double discount;
    static double balance;
    static double money;
    
    static void enterBookDetails(){
       Scanner myObj= new Scanner(System.in); // create scanner object

        System.out.println("Enter Book Title: "); // ask for a title 
         BookTitle = myObj.nextLine(); // store the title

        System.out.println("Enter Days Overdue: "); //ask for days overdue
        dayoverdue = myObj.nextInt(); //store days overdue
        
    }

//calculateFine() – total fine = days overdue × fine per day.
    static void calculateFine(){
     totalFine = finePerDay*dayoverdue;
    System.out.println("Total fine= "+ totalFine);
    }


    //applyDiscount() – if fine > 5,000, apply 10% discount.
    static void applyDiscount(){
        if (totalFine>5000) {
            discount = totalFine*0.1; 
        }
        else{
            discount = totalFine;
        }
    }

//payment() – enter amount paid, calculate balance/change.
static void payment(){
      Scanner cash = new Scanner(System.in);

      System.out.println("Enter the money to pay ");
      money = cash.nextInt();
      if (money<discount) {
        do{
            
      System.out.println("Not Enough money!!! Your fine is "+  discount + " Enter Enought Money!");
      money = cash.nextInt();
        } while (money<=discount) ;
      }

    balance = money -  discount;
    System.out.println("Your balance is: "+ balance);
    
      
}    

//displayReceipt() – show book title, overdue days, fine, discount, total payable, amount paid, balance.
static void displayReceipt(){
    System.out.println(" \n \n ");
    System.out.println("---------------------------");
    System.out.println("-----     RECEIPT     -----");
    System.out.println("---------------------------");
    System.out.println("     Liblary Rwanda     ");
    System.out.println("     Tel:+250 000 000  ");
    System.out.println("---------------------------");
    System.out.println("Book Title: "+ BookTitle);
    System.out.println("Overdue days: "+ dayoverdue);
    System.out.println("Total Fine: "+ totalFine);
    System.out.println("Total Fine after Discount: "+ discount);
    System.out.println("---------------------------");
    System.out.println("Total Payable: "+ money);
    System.out.println("----------------------");
    System.out.println("Pay Mode | Bank | Amount\n");
    System.out.println("Amount paid: "+ discount);
    System.out.println("Balance: "+ balance);
    System.out.println("---------------------------");
}

    //the main function
    public static void main(String[] args) {
        
         enterBookDetails();
         calculateFine();
         applyDiscount();
         payment();
         displayReceipt();

    }
    
}


 /*
 Methods & User Input:

enterBookDetails() – ask for:

Book title (String)

Days overdue (integer ≥0)

Fine per day fixed at 500

calculateFine() – total fine = days overdue × fine per day.

applyDiscount() – if fine > 5,000, apply 10% discount.

payment() – enter amount paid, calculate balance/change.

/ displayReceipt() – show book title, overdue days, fine, discount, total payable, amount paid, balance.

Requirements:

Scanner input.

Static methods only.

Validate days overdue ≥0, payment ≥ total.
  */


 