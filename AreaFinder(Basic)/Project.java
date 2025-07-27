import java.util.*;

class Project {
    public static void main(String[] args) {
         
       Scanner in = new Scanner(System.in);
       options();
        

       while(true){
    
       System.out.print("Enter Option: ");
       int options = in.nextInt();
        
        switch (options) {
            case 1:
                System.out.print("Value of a: ");
                int a = in.nextInt();
                System.out.println("Area of Square is: " + Square(a));
                break;
    
            case 2:
                System.out.print("Value of h: ");
                int h = in.nextInt();
                System.out.print("Value of b: ");
                int b = in.nextInt();
                System.out.println("Area of Recangle is: " + Rectangle(h, b));
                break;
    
            case 3:
                System.out.print("Value of b: ");
                int bTri = in.nextInt();
                System.out.print("Value of h: ");
                int hTri = in.nextInt();
                System.out.println("Area of Triangle is: " + Triangle(bTri, hTri));
                break;
    
            case 4:
                System.out.print("Value of r: ");
                int r = in.nextInt();
                System.out.println("Area of circle is: " + Circle(r));
                break;
           
            default:
                in.close();
                return;
           }

           System.out.println();
           options(); 
           
        } 
       }

       

    

    static void options(){
        System.out.println("Options-----------------------");
        System.out.println("1: Area of Square");
        System.out.println("2: Area of Rectangle");
        System.out.println("3: Area of Triangle");
        System.out.println("4: Area of Circle");
        System.out.println("5 or another num: Exit");
    }
    
    static int Square(int a){
        if(a<=0){
            return -1;
        }

        return a*a;
    }

    static int Rectangle(int h, int w){
        if(h <=0 || w <=0){
            return -1;
        }
        return h*w;
    }

    static int Triangle(int b, int h){
        if(b<=0 || h<=0){
            return -1;
        }
        return (b*h)/2;
    }

    static double Circle(int r){
        if(r<=0){
            return -1;
        }

        return (double) r*r*Math.PI;
    }
}