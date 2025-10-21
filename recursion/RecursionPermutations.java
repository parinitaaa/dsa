public class RecursionPermutations {
    public static void main(String[] args) {
       
      permutation("abcd","");
      System.out.println("count:"+count("abcd",""));


    }
    public static void permutation(String q,String ans)
    {
        if(q.isEmpty())
        {
            System.out.println(ans);
            return;

        }
        char ch=q.charAt(0);
        for(int i=0;i<=ans.length();i++)
        {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
            permutation(q.substring(1),first+ch+second);
        }
       
        
    }
    public static int count(String q,String ans)
    {
        if(q.isEmpty())
        {
            return 1;

        }
        int counts=0;
        char ch=q.charAt(0);
        for(int i=0;i<=ans.length();i++)
        {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
           counts=counts+ count(q.substring(1),first+ch+second);
        }
        return counts;
       
        
    }
}
