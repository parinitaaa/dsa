package linkedlist.DLL;

public class dlloperations {
     public Node head;
    public Node tail;
    public int size;

    public dlloperations()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        Node temp1=null;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp1=temp;
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("REVERSE:");
        while(temp1!=null)
        {
             System.out.print(temp1.value+" -> ");
             temp=temp1; //unnecessary
             temp1=temp1.prev;
        }
        System.out.println("START");
    }
    public void display1() //my own 
    {
        Node temp=head;
        Node temp1=null;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp1=temp;
            temp=temp.next;

        }
        System.out.println("END");
        System.out.println("reversed list");
        while(temp1!=null)
        {
            System.out.print(temp1.value+"->");
            temp1=temp1.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val)
    {
        if(head==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        Node temp=head;
        while(temp.next!=null)//last element
           temp=temp.next;
        temp.next=node;
        node.next=null;
        node.prev=temp;
        size++;
    }
    public Node find(int value)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.value==value)
              return temp;
            temp=temp.next;
        }
        return null;
    }
    public void insertRandom(int val, int index)
    {
        if(index==0)
        {insertFirst(val);
         return;
        }
         if (index == size) { 
        insertLast(val);
        return;
    }
        Node node =new Node(val);
        Node temp=head;
        for(int i=1;i<index;i++)
          temp=temp.next;
        Node temp1=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next=temp1;
        temp1.prev=node;
        size++;
    
    }
     public void insertAfter(int after, int val)
     {
        Node afterNode=find(after); 
        if(afterNode==null)
        {
            System.out.println("node does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=afterNode.next;
        node.prev=afterNode;
        afterNode.next=node;
        if(node.next!=null)
          node.next.prev=node;
     }
      public void deleteFirst()
    {
        if (head == null) return;
        int val=head.value;
        head=head.next;
        if(head!=null)
        {
            head.prev=null;
        }
        System.out.println("deleted element is "+ val);
        size--;
    }

    public void deleteLast()
    {
        if(size<=1) {deleteFirst(); return;}
        Node temp=head;
        for(int i=2;i<size;i++) //i=2 to access the second last element
            {
                temp=temp.next;
            }   
            int val=temp.next.value;
            temp.next=null;
            size--;
        System.out.println("deleted element is "+ val);
    }
    public void deleteRandom(int index)
    {
        if (index == 0) {deleteFirst(); return; }
    if (index == size - 1) {deleteLast(); return;}
    Node temp=head;
     for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
    
     Node temp1=temp.next;
    int val=temp1.value;
    temp.next=temp1.next;
    temp1.next.prev=temp;
     size--;
     System.out.println("deleted element is "+ val);
    }
    public static void main(String[] args) {
        dlloperations first= new dlloperations();
        first.insertFirst(1);
        first.insertFirst(6);
        first.insertLast(2);
        first.insertRandom(100,3);
       // first.insertFirst(19);
       // first.insertFirst(3);
        //first.display();
        first.display1();
       // first.deleteRandom(3);
        System.out.println("size= "+first.size);
        //first.display();
    }
    
}
