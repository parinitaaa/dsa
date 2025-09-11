package logic;
import java.util.Scanner;
public class SwappingWithThirdVariable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping: "+ a +" and "+ b);
        swap(a,b);
        sc.close();
    }
     static void swap(int a, int b)
     {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping swapping: "+ a +" and "+ b);
        
     }
    
}
