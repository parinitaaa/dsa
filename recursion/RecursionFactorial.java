//package recursion;
import java.util.Scanner;
public class RecursionFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
       int x=fact(num);
       System.out.println(x);
    }
    static int fact(int num)
    {
        if(num==1) //num<=1
        return 1;
        return num*fact(num-1);
        
    }
}
