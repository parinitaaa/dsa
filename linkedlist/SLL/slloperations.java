package linkedlist.SLL;

public class slloperations {
    public Node head;
    public Node tail;
    public int size;

    public slloperations()
    {
        this.size=0;
    }

    public void insertFront(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
          tail=node;
        }
        size+=1;
    }
    public void insertLast(int val)
    {
        if (tail==null)
        {
            insertFront(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertRandom(int val, int index)
    {
        if(index==0){ insertFront(val) ; return;}
        if(index==size){ insertLast(val); return;}
        Node temp=head;
        for(int i=1; i<index;i++) //if index is 3, go till 2
        {
           temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
        
    }

    public void insertRecursion(int val,int index)
    {
        head=insertRecursion(val,index,head);
    }
    public Node insertRecursion(int val, int index, Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRecursion(val, index-1, node.next);
        return node;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public void deleteFirst()
    {
        int val=head.value;
        head=head.next;
        System.out.println("deleted element is "+ val);
        size--;
        if(head==null) tail=null;

    }

    public void deleteLast()
    {
        if(size<=1) {deleteFirst(); return;}
        Node temp=get(size-2); //-2 cause index over here; for last element=-1
          /*   for(int i=2;i<size;i++) //i=2 to access the second last element
            {
                temp=temp.next;
            } */

        int val=tail.value;
        tail=temp;
        tail.next=null; //tail.next=temp.next  both are same, use any one
        size--;
        System.out.println("deleted element is "+ val);
    }

    public Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
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

public void deleteRandom(int index)
{
     if (index == 0) {deleteFirst(); return; }
    if (index == size - 1) {deleteLast(); return;}
    /*Node temp=head;
     for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
    
     Node temp1=head;
    temp1=temp.next;
    int val=temp1.value;
    temp.next=temp1.next;
     size--;
     System.out.println("deleted element is "+ val);*/

     Node prev=get(index-1);
     int val1=prev.next.value;
     prev.next=prev.next.next;
     size--;
     System.out.println("deleted element is "+ val1);


}
    public static void main(String[] args) {
        slloperations first= new slloperations();

        first.insertFront(3);
        first.insertFront(4);
        first.insertFront(1);
        first.insertFront(5);
        first.insertLast(18);
        first.insertRandom(300, 3);
        first.insertRecursion(100, 3);
        System.out.println("size= "+first.size);
        first.display();
        first.deleteRandom(2);
        first.display();
        System.out.println("size= "+first.size);
    }


    
}
