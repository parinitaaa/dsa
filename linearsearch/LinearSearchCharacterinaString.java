package linearsearch;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchCharacterinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.next();
        System.out.println("enter character to search for");
        char ch=sc.next().trim().charAt(0);
        sc.close();
        System.out.println(Arrays.toString(str.toCharArray()));
        int res= linearsearch(str,ch);
        if (res==-1)
        {
            System.out.println("item not found");
        }
        else
        System.out.println("item found at index "+res);


    
}
 public static int linearsearch(String str, char ch)
 {
    if(str.length()==0)
    {
        return -1;
    }

   for (int i = 0; i < str.length(); i++)    //for( char x:str.toCharArray())
   {                                           //   if(x==ch) return
      if(str.charAt(i)==ch)
       return i;
    
    }
    return -1;
 }


}

