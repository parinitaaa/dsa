package linkedlist;

public class removeduplicatedfromsorted {
     public ListNode deleteDuplicates(ListNode head) {
       if(head==null) return null;
       ListNode temp=head;
       while(temp.next!=null)
       {
        if(temp.val==temp.next.val)
         temp.next=temp.next.next;
        else
         temp=temp.next;
       }
       return head;
}
public static void main(String[] args) {
   removeduplicatedfromsorted first= new removeduplicatedfromsorted();

        first.insertFront(1);
        first.insertFront(1);
        first.insertFront(2);
        first.insertFront(4);
        first.insertFront(4);
        first.display();
        first.head=first.deleteDuplicates(first.head);//first.head refers to the entire list and not the first element only
        first.display();
        
    
}
public ListNode head;
public ListNode tail;
public int size;

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

    
}
