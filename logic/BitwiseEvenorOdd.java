package logic;
import java.util.Scanner;
public class BitwiseEvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int x= sc.nextInt();
        if((x&1)==1)
        System.out.println("odd");
        else
        System.out.println("even");
        sc.close();
    }
    
}
