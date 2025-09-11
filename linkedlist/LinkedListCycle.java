package linkedlist;

public class LinkedListCycle {
    
     public ListNode head;
    public ListNode tail;
    public int size;
    public Boolean cycle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
             return true;
        }
        return false;

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
  LinkedListCycle first = new LinkedListCycle();

    first.insertFront(1);
    first.insertFront(5);
    first.insertFront(2);
    first.insertFront(4);
    first.insertFront(6);

    // Commenting display because it will loop forever if cycle is created
    // first.display();

    // Create a cycle: make the last node (which is the first inserted one with val 1 point to the node with value 2
    ListNode temp = first.head;
    ListNode target = null;

    while (temp.next != null) 
    {
        if (temp.val == 2 && target == null) {  //temp is the node with value 2
            target = temp;
        }
        temp = temp.next;
    }

    // temp now points to last node
    if (target != null) {
        temp.next = target; // cycle created
    }

    // Check for cycle
    System.out.println(first.cycle(first.head)); // Should print true
}
}

