package linkedlist.CLL;

public class clloperations {
    public Node head;
    public Node tail;
    public int size;
    public clloperations()
    {
        this.size=0;
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            tail.next=head;
            size++;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        if(head!=null)
        {
        do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        } while(temp!=head);
            
    }
        System.out.println("HEAD");
    }
    public void delete(int val)
    {
        Node temp=head;
         if (temp == null) return;
         if(head==tail) //only one element
         {
            head = null;
            tail = null;
            size--;
            return;
        }

         if(temp.value==val) //first element
         {
             head=temp.next;
             tail.next=temp.next; //tail.next=head
             size--;
             return;
         }
         do{
            Node temp1=temp.next; //next element cause we've concluded that we dont wanna delete the first element
            if(temp1.value==val)
            {
                temp.next=temp1.next;
                if (temp1== tail) //last element
                    {
                    tail = temp;
                    }
                    size--;
                break;
            }
            temp=temp.next; //if it isnt the value, keep traversing
         }while(temp!=head);
        
    }
    public static void main(String[] args) {
        clloperations first=new clloperations();
        first.insert(5);
        first.insert(7);
        first.insert(19);
        first.insert(56);
        first.delete(19);
        first.display();
    }
}
