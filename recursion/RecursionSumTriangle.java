package recursion;
import java.util.Arrays;
public class RecursionSumTriangle {
    public static void printTriangle(int[] A)
    {
       
        if(A.length<1)
        return;
        System.out.println(Arrays.toString(A));
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }
        printTriangle(temp);
      
       
    
}
public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
}
