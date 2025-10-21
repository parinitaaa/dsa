//package recursion;
import java.util.Scanner;

public class RecursionPrime {
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(prime(num,2)? "prime":"not prime");
        sc.close();
}
public static boolean prime(int num,int i)
{
    if(i>num/2)
     return true;
     return ((num%i!=0) && prime(num,i+1));
}
}
