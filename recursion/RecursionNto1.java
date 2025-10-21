//package recursion;
import java.util.Scanner;
public class RecursionNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter:");
        int num=sc.nextInt();
        sc.close();
        recur(num);
    }
    public static void recur(int num)
    {
        if(num==0)
        return;
        System.out.println(num);
        recur(num-1);

    }
    
}
