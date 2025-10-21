import java.util.Scanner;
public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nth fibonacci term");
        int num=sc.nextInt();
        System.out.println(fibo(num));
        sc.close();
    }
    public static int fibo(int n){
    if(n==1||n==0)
    return n;
    System.out.println("the"+n+"th fibonacci term is:");
    return fibo(n-1)+fibo(n-2);
}
}