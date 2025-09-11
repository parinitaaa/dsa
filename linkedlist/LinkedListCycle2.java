package linkedlist;

public class LinkedListCycle2 {
    
    public ListNode head;
    public ListNode tail;
    public int size;
    public void cycle(ListNode head) //if cycle is present or not
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
             System.out.println("tail connects to node index "+beginningofcyclenode(head)); 
             return;
            }
        }
        System.out.println("no cycle"); 

}
public int beginningofcyclenode(ListNode head) //if present, itll return the node at which the cycle starts

{
   int length=LengthCycle(head);
    ListNode f=head;
    ListNode s=head;
    int index=0;
    while(length!=0)
    {
        s=s.next;
        length-=1;
    }
    while(f!=s)
    {
        f=f.next;
        s=s.next;
        index+=1;
    }
    return index;

    /*public int beginningofcyclenode(ListNode head, ListNode meetingpoint) {    2ND WAT
        ListNode temp = head;
        int index = 0;
        while (temp != meetingpoint) {
            temp = temp.next;
            meetingpoint = meetingpoint.next;
            index += 1;
        }
        return index;
    }*/
    
    

}
   
    /*int lengthofcycle=LengthCycle(head);   1ST WAY
    int length=1; //length of whole string
    ListNode temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
        length+=1;
    }
    int k=length-lengthofcycle;
    return (k-1);
}*/
public int LengthCycle(ListNode head) //returns length of cycle
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
             {
                int length=1;
                ListNode temp = slow.next;
                while(temp!=slow)
                {
                    temp=temp.next;
                length+=1;
                }
               return length;
             }
           
        }
        return 0;
}
 public static void main(String[] args) {
  LinkedListCycle2 first = new LinkedListCycle2();

    first.insertFront(1);
    first.insertFront(5);
    first.insertFront(2);
    first.insertFront(4);
    first.insertFront(6);
     first.insertFront(7);
    first.display();

    // Commenting display because it will loop forever if cycle is created
    // first.display();

    // Create a cycle: make the last node (which is the first inserted one with val 1 point to the node with value 2
    ListNode temp = first.head;
    ListNode target = null;

    while (temp.next != null) {
        if (temp.val == 2 && target == null) {
            target = temp;
        }
        temp = temp.next;
    }

    // temp now points to last node
    if (target != null) {
        temp.next = target; // cycle created
    }
    // Check for cycle
    first.cycle(first.head);
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
}
