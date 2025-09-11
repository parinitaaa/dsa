package recursion;
import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int num=sc.nextInt();
        recur(num);
        sc.close();
    }
    public static void recur (int num)
    {
        if(num==0)
         return;
        System.out.println(num);
        recur(--num); // num-- wont work
        //num-1 OR --num
    }
}
