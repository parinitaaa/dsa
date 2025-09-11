package recursion;

public class RecursionSubset {
    public static void main(String[] args) {
        String s="abc";
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
}
