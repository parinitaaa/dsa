import java.util.Scanner;
public class BrokenCalculator991 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start value and target");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(perform(x,y));
        sc.close();
    }

    public static int perform(int x,int y)
    {
        if(x>=y)
         return(x-y);
         if(y%2==0)
          return 1+perform(x,y/2);
          return 1+perform(x,y+1);
    }
    
    

    
}
