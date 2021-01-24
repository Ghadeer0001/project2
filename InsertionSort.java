
package insertionsort;
import java.util.Scanner;
public class InsertionSort {

    
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a size for array");
    int n=input.nextInt();
    int numbers[]=new int[n];
    for(int i=0; i<n;i++){
     System.out.println("Enter item for array ["+i+"]");   
     numbers[i] =input.nextInt();
      }
     System.out.println("the elements after sorting");
  
      InsertionSort(numbers);
      
      for(int i=0;i<n;i++)
       System.out.println(numbers[i]);  
    }
     public static void InsertionSort(int numbers[]){
     int n=numbers.length;
     for(int i=1;i<n;i++){
      int j=i;
      int temp=numbers[i];
     while(j>0&&temp<numbers[j-1]){
      numbers[j]=numbers[j-1];
       j=j-1;
   }
    numbers[j]=temp;
  }
}
    
}
