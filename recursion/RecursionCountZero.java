import java.util.Scanner;
public class RecursionCountZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("total zeroes are: "+cz(num,0));
        sc.close();
    }
    public static int cz(int num,int count)
    {
        if(num==0)
         return count;
         int rem=num%10;
         if(rem==0)
          return cz(num/10,count+1);
        else
       return  cz(num/10,count);

    }
    
}
