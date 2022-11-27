import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    System.out.println("How many Series? ");
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
          System.out.println("Enter first Number a");
            int a = in.nextInt();
                 System.out.println("Enter second Number b");
            int b = in.nextInt();
                 System.out.println("Enter third Number n");
            int n = in.nextInt();
            int result = a;
                System.out.println("**********************");
            for(int j = 0; j<n; j++){    
                result = Main.equation(b, j, result);          
                System.out.print(result + " ");
            }
         System.out.println("**********************");
        }
        in.close();
  }

  public static int equation(int b, int j, int res){   
        double factor = Main.powerOf(2, j);
        res += factor * b;          
        
        return res;
    }
    
    public static double powerOf(int x, int y){
        return Math.pow(x, y);
    }
}