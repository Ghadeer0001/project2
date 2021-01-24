
package recursioncrazysum;
import java.util.Scanner;
public class RecursionCrazySum {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=input.nextInt();
     int result=CrazySum(n);
     System.out.println(result);
    }
    public static int CrazySum(int n){
       if(n==1) 
         return 1;
       else
         return Power(n,n)+CrazySum(n-1);
              
    }
     public static int Power(int a , int b){
        if(b==0)
            return 1;
        else
            return a*Power(a,b-1);
}
}