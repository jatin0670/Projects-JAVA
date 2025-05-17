import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt;

        do{
        menu();
        System.out.println("----------------");

        opt = in.nextInt();

        switch (opt) {
            case 1:
                System.out.print("Enter first val: ");
                int a = in.nextInt();
                System.out.print("Enter second val: ");
                int b = in.nextInt();
                add(a,b);
                break;

            case 2:
                System.out.print("Enter first val: ");
                int a1 = in.nextInt();
                System.out.print("Enter second val: ");
                int b1 = in.nextInt();
                min(a1,b1);
                break;

            case 3:
                System.out.print("Enter first val: ");
                int a2 = in.nextInt();
                System.out.print("Enter second val: ");
                int b2 = in.nextInt();
                mul(a2,b2);
                break;

            case 4:
                System.out.print("Enter first val: ");
                int a3 = in.nextInt();
                System.out.print("Enter second val: ");
                int b3 = in.nextInt();
                if(b3>0){
                 div(a3,b3);   
                }else{
                    System.out.println("Cannot divide by zero.");
                }
                
                break;
        
            default:
                System.out.println("Invalid opt");
                break;
        }
        System.out.println("");
        in.close();
    }while(opt!=0);

    }

    static void menu(){
        System.out.println("Choose Operation");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("0: Exit");
    }

    static void add(int a, int b){
        System.out.println("Ans: " + (a+b));
    }

    static void min(int a, int b){
        System.out.println("Ans: " + (a-b));
    }

    static void mul(int a, int b){
        System.out.println("Ans: " + a*b);
    }

    static void div(int a, int b){
        System.out.println("Ans: " + a/b);
    }
}
