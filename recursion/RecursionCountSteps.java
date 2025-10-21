//leetcode 1342
import java.util.Scanner;
public class RecursionCountSteps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int num=sc.nextInt();
        System.out.println(helper(num,0));
        sc.close();
    }
    public static int helper(int num, int steps)
    {
        if (num==0)
         return steps;
         if(num%2==0)
         return helper(num/2,steps+1);
         return helper(num-1,steps+1);

    }
}