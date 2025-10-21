//package recursion;

public class RecursionSubset {
    public static void main(String[] args) {
        String s="abc";
      //subset(s,"");
      subset(s,"");


    }
    public static void subset(String q,String ans)
    {
        if(q.isEmpty())
        {
            System.out.println(ans);
            return;

        }
        subset(q.substring(1),ans+q.charAt(0));
        subset(q.substring(1),ans);
        
    }
    public static void subsetascii(String q,String ans)
    {
        if(q.isEmpty())
        {
            System.out.println(ans);
            return;

        }
        char ch=q.charAt(0);
        subsetascii(q.substring(1),ans+ch);
        subsetascii(q.substring(1),ans);
        subsetascii(q.substring(1),ans+(ch+0));
    }
}
