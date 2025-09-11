package recursion;
import java.util.Scanner;
public class RecursionProdofTwoNos {
    public static void main(String[] args) {
        System.out.println("enter 2 nos");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
        System.out.println(prod(num1,num2));
        else
        System.out.println(prod(num2,num1));
          sc.close();      
            }
        
    public static int prod(int num1, int num2) 
    {
        
        if(num2==0)
         return 0;
       return num1+prod(num1,num2-1);
               
     }
    
}
