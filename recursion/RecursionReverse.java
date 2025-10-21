//package recursion;
import java.util.Scanner;
public class RecursionReverse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
       int x=reverse(num,0);
       System.out.println(x);
       System.out.println("is it palindrom:"+palindrome(num));
}
static int reverse(int num,int sum)
{
    if(num==0)
    return sum;
    sum=sum*10+num%10;
    return reverse(num/10,sum);
}
static boolean palindrome(int n)
{
    return n==reverse(n,0);
}


}
