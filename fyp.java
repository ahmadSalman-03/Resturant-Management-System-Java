import java.util.Random;
import java.util.Scanner;
//........@lill_.bunny
public class fyp
{ static Random abc = new Random();
      static int random_number = abc.nextInt(4)+1;
    public static void main(String[]args)
    {
    table();
    menu();
    checkout();
    }
        public static void menu(){
        Scanner sc = new Scanner(System.in);
        int index=0;      // dishes by code
        char order_changing =0; // for order changing or confirmation
        char cancel_order; // for order cancelation
        //int count_order; // counting no of dishes ordered
        int qty =0;
        System.out.println("\nWelcome To The Hungry Bunny Restaurant\n");
         System.out.println("\n=============================================\n\nCode \t      \tDish Name\t      \tPrice\n=============================================\n" ); // menu
        String menu[] = { "Chicken Karahi", "Biryani\t", "Dampukh\t", "Pizza\t", "Siji\t", "Fried Fish","Nehari\t","Halwa\t","Kheer\t","Rus Malai","Malai Boti","Haleem\t","BBQ\t","Kabli Pulao","Siri Pae","Fried Rice","Trifle\t","Malai Kofta","Soda          ", "Shake          ", "Slush          ", "Coffee      ", "Tea          ", "Juice          ","Cold Drink","Lemonade","Ice-cream Shake","Pina Colada","Margareta","Energy Drinks","Sherbet       ","Latte          ","Lassi        ","Milk          ","Jam e Shirin","Coconut Water"};
        int price[] = {1000,120,25000,1800,700,650,400,200,300,280,250,100,300,200,1500,150,180,380,100,150,60,200,70,50,40,50,250,700,650,100,380,100,50,50,80,180 };//dishes ofered restaurent
       // int quantity[] = new int[18];
                int code[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37};

         String selected_menu[] = new String[37];
         
          for(int i=0;i<menu.length;i++)
          {
              System.out.println(code[i]+".\t\t"+menu[i]+"\t\t"+price[i]);
              System.out.println("---------------------------------------------");
          }
        int total =0;//= { 100,450,889,1000 };//dishes ofered restaurent
//        System.out.println("How many dishes do you want to order?"); 
        //int no_of_orders = 18;    // no of dishes which costumer want to 
        int confirm =0;
        int finalcount =0;//counting no of dishes ordered
       do
        {
           
            System.out.println("Select your Dish(s) according to code : ");
           // count_order=0; // final selected dishes counter by default zero
          // selected_menu = null;
            for (int i = 1; i <= menu.length; i++) // loop according to selected no of orders
            {   
            if (confirm==0){
             System.out.print("Enter Dish Code : ");
            index = sc.nextInt();   // code of dishes a
            confirm=1;
            
                }
                else{
                
             System.out.print("Enter Dish Code Or Press '99' to Confirm your order : ");
            index = sc.nextInt();   // code of dishes a
//                System.out.println("Do you want drinks (1/0)?");
                
            if (index==99 || index==99){
              break;  
            }
                }
           
            if(index<menu.length){ 
            System.out.print("Enter Dish Quantity :");
            qty = sc.nextInt();
            
            }
            
            if(index<menu.length)
            {
                finalcount=finalcount+1;
                 int sub_total =0;
                 sub_total = qty * price[index];
               selected_menu[finalcount] = (finalcount)+".\t\t"+ menu[index]+"\t\t"+qty+"\t\t"+price[index]+"\t\t"+sub_total;
              
               total = total + sub_total;
                System.out.println("You ordered : "+menu[index]+price[index]);
                //count_order++; // selected dish counter variable 
            }
            else
            {
                System.out.println("Dish code not found!");    // invalid code entry in dish selection
               // no_of_orders = no_of_orders+1;
            }
           
        }
        System.out.println("You Selected "+finalcount+" dishes");
        System.out.print("Do you want to cancel your order?\npress Y/y for cancelation : ");
        cancel_order = sc.next().charAt(0);
        
        if (cancel_order=='y' || cancel_order=='Y')
        {
            System.out.println("ORDER CANCELLED");
            break;  // for order cancelation
        }
        else
        {
            System.out.print("Press any key for order confirmation or press C/c for changing order : ");
        }
        order_changing=sc.next().charAt(0);
         String newselectedmenu[] = new String[37];
          if (order_changing=='C' || order_changing=='c'){
           selected_menu= newselectedmenu;
           total =0;
           finalcount=0;
        }
        // for order confirmation or changing
        }while(order_changing=='C' || order_changing=='c');
        if (cancel_order=='y' || cancel_order=='Y')
        {
            System.out.println("ORDER CANCELLED");
//            break;  // for order cancelation
        }
        else{
            //System.out.println(finalcount);
             System.out.println("\n=====================================================================================\n\n\t\t\t      The Hungry Bunny\n\t\t\tEmail  : restaurantxyz@gmail.com\n\t\t\t  Contact no  : 0321-5464323\n");
                       //System.out.println("                       \t\t Email  : restaurantxyz@gmail.com\t");
                       //System.out.println("                       \t\t Contact no  : 0321-5464323\t");


                   System.out.println("=====================================================================================\nS.No \t      \tItem Name\t \tQty\t \tUnit Price \tSubtotal\n=====================================================================================\n" ); // menu

          for (int i = 1; i <= finalcount; i++) // loop according to selected no of orders
        {  

              System.out.println(selected_menu[i]);
               System.out.println("-------------------------------------------------------------------------------------");
          }
          
    System.out.println("Table no : "+random_number +"\t\t\t\t\t\tTotal\t:\t"+total);
           System.out.println("-------------------------------------------------------------------------------------");
        }
        int payment=0;
        //payment
        do{
        int res_lt=0;
            System.out.print("PAYMENT : ");
            payment = sc.nextInt();
            if(payment>=total){
            res_lt = payment - total;
            System.out.println("CHANGE : "+ res_lt);}
            else{
                System.out.println("Not Enough Cash! Give full payment.");
            }}
        while(payment<total);
                      
}

    
    public static void  checkout()
    {
        String checkout="Thank you for your appearance in our restaurant";
        System.out.println(checkout);
    }
    public static void  table(){
//        Random abc = new Random();
//       int random_number = abc.nextInt(5);
              //int x= sc.nextInt();
              switch(random_number){
                  case 1:
                      System.out.println("table 1 is available .");
                      break;
                  case 2:
                      System.out.println("table 2 is available.");
                      break;
                  case 3:
                      System.out.println("table 3 is available.");
                      break;
                  case 4:
                      System.out.println("table 4 is available.");
                      break;
                  case 5:
                      System.out.println("table 5 is available.");                 
              }
    }
}

