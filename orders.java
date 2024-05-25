import java.util.Scanner;

public class orders {
    
    public static void main(String[]args){
     checkin();
    menu();
    checkout();
    }
public static void menu(){
Scanner sc = new Scanner(System.in);
         int index;      // dishes by code
        char order_changing; // for order changing or confirmation
        char cancel_order; // for order cancelation
        int count_order; // counting no of dishes ordered
        System.out.println("\nCODE \t      \tDISH NAME"); // menu
        System.out.println(
                "0\t------>\tChicken Karahi\t---->Rs.1000\n1\t------>\tBiryani\t---->Rs.120\n2\t------>\tDampukh\t---->Rs.2500\n3\t------>\tPizza\t---->Rs.1200\n4\t------>\tSiji\t---->Rs.500\n5\t------>\tfried fish\t--->Rs.450\n6\t------>\tNehari\t---->Rs.1400\n7\t------>\tHalwa\t---->Rs.100\n8\t------>\tKheer\t---->Rs.50\n9\t------>\tRus Malai\t---->Rs.80\n10\t------>\tMalai Boti\t---->Rs.150\n11\t------>\tHaleem\t--->Rs.200\n12\t------>\tBBQ\t---->Rs.300\n13\t------>\tKabli Pulao\t---->Rs.200\n14\t------>\tSiri Pae\t---->Rs.1500\n15\t------>\tFried Rice\t---->RS.100\n16\t------>\tTrifle\t---->Rs.150\n17\t------>\tMalai Kofta\t---->Rs.100");
         String menu[] = { "Chicken Karahi", "Biryani", "Dampukh", "Pizza", "Siji", "Fried Fish","Nehari","Halwa","Kheer","Rus Malai","Malai Boti","Haleem","BBQ","Kabli Pulao","Siri Pae","Fried Rice","Trifle","Malai Kofta"};
        int price[] = {1000,120,2500,1200,500,450,1400,100,50,80,150,200,300,200,1500,100,150,100 };//dishes ofered restaurent
          String selected_menu[] = new String[18];
          int total =0;//= { 100,450,889,1000 };//dishes ofered restaurent
        System.out.println("How many dishes do you want to order?"); 
        int no_of_orders = sc.nextInt();    // no of dishes which costumer want to order
        do{
            System.out.println("Select your dish according to code:");
            count_order=0; // final selected dishes counter by default zero
        for (int i = 1; i <= no_of_orders; i++) // loop according to selected no of orders
        {   
            index = sc.nextInt();   // code of dishes a
            
           if(index<menu.length)
            {
               selected_menu[i] =  menu[index]+price[index];
               total = total + price[index];
            System.out.println("You ordered : "+menu[index]+price[index]);
            count_order++; // selected dish counter variable
            
                
            }
            else
            {
                System.out.println("Dish code not found!");    // invalid code entry in dish selection
            }
           
        }
        System.out.println("You Selected "+count_order+" dishes");
        System.out.println("Do you want to cancel your order?\npress Y/y for cancelation");
        cancel_order = sc.next().charAt(0);
        
        if (cancel_order=='y' || cancel_order=='Y')
        {
            System.out.println("ORDER CANCELLED");
            break;  // for order cancelation
        }
        else
        {
            System.out.println(" you didn't cancel your order now, Press any key for order confirmation or press C/c for changing order");
        }
        order_changing=sc.next().charAt(0);
        // for order confirmation or changing
        }while(order_changing=='C' || order_changing=='c');
          for (int i = 0; i <= no_of_orders; i++) // loop according to selected no of orders
        {  
              System.out.println(selected_menu[i]);
          }
    System.out.println("Your Total : "+total);
}
public static void checkin(){
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("                                     ");
        System.out.println("                                     ");;
        System.out.println("    WELCOME TO WAH CONTINENTAL HOTEL  ");
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("------------------------------------");
        System.out.println("                                     ");
        // customer checks in here.
        System.out.println("Customer Checked in");
        System.out.println("                    ");
        // System take information of the customer
        System.out.println("What is your name sir? ");
        String name=input.nextLine();
        System.out.println("Please provide us your contact number");
        char number= input.next().charAt(0);
        if(number>=65 && number<=90){
            System.out.println("Invalid entry");
       System.out.println("Enter valid number: ");
             long re_number= input.nextLong();
        }
        else if(number>=97 && number<=122){
            System.out.println("Invalid entry");
       System.out.println("Enter valid number: ");
             long re_number= input.nextLong();
        }
        else if(number>=0 && number<=47 ||number>=58 &&number<=64||
  number>=91 && number<=96||number>=123 && number<=127){
            System.out.println("Invalid entry");
 System.out.println("Enter valid number: ");
             long re_number= input.nextLong();
        }
        
           
        System.out.println("Email : ");
        String e_mail = input.next();
    }
    public static void  checkout(){
        String checkout="thank you for your appearance in our restaurant";
        System.out.println(checkout);
    }
    }
