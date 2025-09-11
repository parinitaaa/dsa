package recursion;
import java.util.Scanner;
public class Recursion1toN {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
        //recur(1,num);
        recur2(num);
    }
    public static void recur(int x,int num)
    {
        if(x>num)
        return;
        System.out.println(x);
        recur(x+1,num);
    }
    public static void recur2(int num)
    {
        if(num==0)
        return;
        recur2(num-1);
        System.out.println(num);
    }
    
}
