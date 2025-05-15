import java.util.*;

public class Bank {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
       

        int balance = 2000;
        int x;
        manu();

        System.out.println("----------------------------------");
        do{
           
        System.out.print("Enter Opt: ");
           x = in.nextInt(); 
           
           switch (x) {
            case 1:
            System.out.print("Enter Amt: ");
            int val = in.nextInt();
            balance = add(balance, val);
            System.out.println(balance); 
            break;

            case 2:
            System.out.print("Enter Amt: ");
            int val2 = in.nextInt();
            balance = wit(balance, val2);
            System.out.println(balance);
            break;

            case 3:
            System.out.println("Your acc balance is: " + balance);
            break;
        
            default:
            System.out.println("not found");
                break;
            }
            
        }while(x!=0);

        in.close();

    }

        

    static void manu(){
        System.out.println("1: for add balance");
        System.out.println("2: minus balance");
        System.out.println("3: balance check");
    }


    static int add(int bal, int amt){
      return bal + amt;
    
    }

    static int wit(int bal, int amt){
        return bal - amt;
    }




}