package recursion;

public class RecursionMinMax {

     public static int Min(int[] A,int n)
    {
      // if(n==1) return (A[0]);
      //return Math.min(A[n-1],Min(A,n-1));
      if(n==0)
      return A[0];
      return Math.min(A[n],Min(A,n-1));
       
}
public static int Max(int[] A,int n)
    {
       if(n==0) 
       return (A[0]);
      return Math.max(A[n],Max(A,n-1));
       
}
public static void main(String[] args)
    {
        int[] A = { 1, 2, -9, 4, 5 };
        System.out.println(Min(A,A.length-1));
        System.out.println(Max(A,A.length-1));
    }
}
