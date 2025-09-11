package logic;
import java.util.Scanner;

public class BitwiseFindUnique {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter sorted array");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int unique=0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique^arr[i];

            
        }
        System.out.println(unique);
       
      sc.close();
}
}