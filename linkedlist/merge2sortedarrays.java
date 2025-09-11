package linkedlist;

public class merge2sortedarrays {
    public ListNode head;
    public ListNode tail;
    public int size;
    public ListNode merge(ListNode first,ListNode second)
    {
        ListNode f=first;
        ListNode s=second;

        ListNode dummy = new ListNode(-1); // dummy node
        ListNode cur = dummy;
        
        while(f!=null && s!=null)
        {
            if(f.val<s.val)
            {
              cur.next=f;
              f=f.next;
            }
            else{
                cur.next=s;
                s=s.next;
            }
            cur=cur.next;
        }
       cur.next=(f!=null)?f:s;
       return dummy.next; //dummy was just a placeholder, real head starts at dummy.next
    }
    public void insertLast(int val)
    {
        if (tail==null)
        {
            insertFront(val);
            return;
        }
        ListNode node=new ListNode(val);
        tail.next=node;
        tail=node;
        size++;
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
  merge2sortedarrays first= new merge2sortedarrays();
  merge2sortedarrays second= new merge2sortedarrays();
  merge2sortedarrays ans= new merge2sortedarrays();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();
        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(6);
        second.display();
        ans.head=first.merge(first.head,second.head);//first.head refers to the entire list and not the first element only
        ans.display();
        
    
}
}
