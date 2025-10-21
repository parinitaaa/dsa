import java.util.Scanner;
public class RecursionSumNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        System.out.println(sumrecur(num));
        sc.close();

    }
    public static int sumrecur(int num){
        if(num==1)
        return 0;
        return num+sumrecur(num-1);
    }
    
}
