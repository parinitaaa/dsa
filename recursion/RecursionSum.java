package recursion;
import java.util.Scanner;
public class RecursionSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
       int x=sum(num);
       System.out.println(x);

        }
    static int sum(int num)
    {
        if(num==1||num==0) //num<=1
        return num;
        return num+sum(num-1);
        
    }
}
