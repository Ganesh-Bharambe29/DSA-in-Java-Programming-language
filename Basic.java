class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
   Node head;
   public void insert(int data)
   {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
   }
   public void show()
   {
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("Null");
   }
}
public class Basic
{
     public static void main(String args[])
    {
        LinkedList l1=new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        System.out.println("LinkedList is:");
        l1.show();
    }
}
 

   
    

