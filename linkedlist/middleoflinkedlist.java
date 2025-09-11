package linkedlist;

public class middleoflinkedlist {
     public ListNode head;
    public ListNode tail;
    public int size;
    public ListNode middleNode(ListNode head) {
       ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
        /*  ListNode temp=head;
        int length=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            length+=1;
        }
        int x;
        if(length%2==0)
          x=length/2;
         else
          x=(length+1)/2;
         temp=head;
         while(x>0)
         {
            temp=temp.next;
            x-=1;
         }
        return temp;*/
    }
    public void insertFront(int val)
    {
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
          tail=node;
        }
        size+=1;
    }
    public void display()
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public static void main(String[] args) {
   middleoflinkedlist first= new middleoflinkedlist();

        first.insertFront(1);
        first.insertFront(1);
        first.insertFront(2);
        first.insertFront(4);
        first.insertFront(4);
        first.display();
        System.out.println(first.middleNode(first.head).val);
    
}
}
