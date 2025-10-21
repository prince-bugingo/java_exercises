import java.util.Scanner;

public class Cafeteria {
    static Scanner myObj = new Scanner(System.in);
    static String food;
    static int pricePerUnit;
    static int quantity;
    static int total;
    static double money;
    static double balance;
    static double change;


    static void selectItem(){
        
        System.out.println("Enter Food you want");
        food = myObj.nextLine();

        System.out.println("Enter price per item");
        pricePerUnit = myObj.nextInt();

        if (pricePerUnit<0) {
             do {
            System.out.println("Wrong! Please Enter price per item that's greater than 0");
            pricePerUnit = myObj.nextInt();
         }

         while(pricePerUnit<0);
            
        }
               }

   static void quantity(){


    System.out.println("Enter quantity");
        quantity = myObj.nextInt();

   if (quantity<0) {
    do {
            System.out.println("Wrong! Please Enter quantity that's greater than 0");
            quantity = myObj.nextInt();
            } 

        while(quantity<0);
   }
   }  


   static void calculateBill(){
          total = pricePerUnit * quantity;
          System.out.println("Your Total is "+total);
   }

    //enter amount paid, calculate balance/change.
    static void payment(){
    System.out.println("Enter money to process payment");
    money = myObj.nextInt();

if (money<total) {
    do {
            System.out.println("Wrong! Your bill is "+ total + " Please Enter Money greater than that");
            money = myObj.nextInt();
        }
    while(money<total);
}
        balance = money-total;
        System.out.println("Your balance is: "+balance);
   }

   static void displayReceipt(){
      //show item name, quantity, unit price, total, amount paid, balance.
     
    
    System.out.println("---------------------------");
    System.out.println("-----     RECEIPT     -----");
    System.out.println("---------------------------");
    System.out.println("     Cafeteria Rwanda     ");
    System.out.println("     Tel:+250 000 000  ");
    System.out.println("---------------------------");
    System.out.println("Item name: "+ food);
    System.out.println("Quantity: "+ quantity);
    System.out.println("Unit price: "+ pricePerUnit);
    System.out.println("Total : "+ total);
    System.out.println("---------------------------");
    System.out.println("Pay Mode | Bank | Amount\n");
    System.out.println("Amount paid: "+ money);
    System.out.println("Balance: " + balance);
    System.out.println("---------------------------"); 


   }
   public static void main(String[] args) {
    selectItem();
    quantity();
    calculateBill();
    payment();
    displayReceipt();
   }
    
/*
    Methods & User Input:

 selectItem() – ask for:

 Food item (String)

 Price per item (integer > 0)


 quantity() – number of items to order (integer > 0).


calculateBill() – total = price × quantity.'
'

payment() – enter amount paid, calculate balance/change.


displayReceipt() – show item name, quantity, unit price, total, amount paid, balance.
     

Requirements:

Scanner input.

Static methods only.

Validate price > 0, quantity > 0, payment ≥ total.

     */
}
