package binarysearch;
import java.util.Scanner;

public class BinarySearch2DivideChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sweetness array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sweetness array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of friends:");
        int k = sc.nextInt();
        sc.close();

        System.out.println("Maximum minimum sweetness you can get: " + maximizeSweetness(arr, k));
    }

    public static int maximizeSweetness(int[] arr, int k) {
        int min = arr[0]; // Minimum possible sweetness (at least 1)
        int sum = 0;   // Maximum possible sweetness (sum of all elements)
        for (int i : arr) {
            sum += i;
            if(i<min)
             min=i;
        }
         int start=min;
         int end=sum/(k+1);
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(arr,k, mid)) {
                ans = mid; // Update result and try for a larger minimum sweetness
                start = mid + 1;
            }
             else {
                end = mid - 1; // Try for a smaller minimum sweetness
            }
        }

        return ans;
    }

    public static boolean check(int[] arr, int k, int mid) {
        int currentSweetness = 0;
        int count = 0;

        for (int i : arr) {
            if (currentSweetness + i <mid) {
                currentSweetness += i;
            } 
            else {
                count++;
                currentSweetness = 0; 
            }
        }

        return count >=(k+1); // Check if we can make at least `k+1` pieces
    }
}
