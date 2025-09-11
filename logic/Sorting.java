package logic;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter array");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        //bubblesort(arr);
       // selectionsort(arr);
       insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubblesort(int []arr)
    {
         boolean diditswapatleastonce=false; //if it did not swap at least once, it means it is already sorted so break
        for (int i = 0; i < arr.length; i++) { //number of passes is <=n-1/ <n
            for (int j = 1; j < arr.length-i; j++) // for every pass, the last element is either the smallest or largest, so ignore the last n-i elements
               { if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    diditswapatleastonce=true; //it got swapped once
                }
            }
            if(!diditswapatleastonce) //if it didnt swap at least once, come out
            {
                break;
            }
        }
        }
        public static void selectionsort(int []arr)
        {
            for (int i = 0; i < arr.length; i++) { //number of passes is <=n-1/ <n
                //im trying to find the last element so that i can swap my selected element w my last element
                int last = arr.length-i-1; // for each i, it ignores the last element as it is alr sorted, therefore ignored element-1 is the index i wanna swap with
                int maxindex=getmaxindex(arr,0,last); //get index of the maximum element
                swap(arr,maxindex,last); // swap max index with the last index

        }
    }
     public static int getmaxindex(int[]arr, int start, int end)
     {
        int max=start;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max])
            max=i; //max contains the index of the maximum element
            
        }
        return max;
     }
     public  static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void insertionsort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) { // basically perform bubble sort until a particular index and then as i++ it increases the index and performs bubble sort until that updated index
                if(arr[j]<arr[j-1])
                swap(arr,j,j-1);
                else
                break;
            }
            
        }
    }
    public  static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; //index of 3 would be 2 etc
            if (arr[i] != arr[correct]) { //if numbers at both the indexes are not the same, then swap
                swap(arr, i , correct);
            } else {
                i++; // else go to the next number
            }
        }
    }


}  

