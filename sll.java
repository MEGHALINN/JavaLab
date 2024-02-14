class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class sll
{
    Node head;
    sll()
        {
            this.head=null;
        }
    public void insertf(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
                head=newnode;
            else
                {
                    newnode.next=head;
                    head=newnode;
                }
        }
    public void inserte(int data)
        {
            Node newnode=new Node(data);
            Node temp=head;
            if(head==null)
                head=newnode;
            else
                {
                    while(temp.next!=null)
                        temp=temp.next;
                    temp.next=newnode;
                }
        }
    public void deletef()
        {
            if(head==null)
                return;
            else
                head=head.next;
        }
    public void deletee()
        {
            if(head==null)
                return;
            else
                {
                    Node temp=head;
                    Node ptr = null; 
                    while(temp.next!=null)
                        {
                            ptr=temp;
                            temp=temp.next;
                        }
                    ptr.next=null;
                }
        }
    public void display()
        {
            Node temp=head;
            while(temp!=null)
                {
                    System.out.print(temp.data+"\t");
                    temp=temp.next;
                }
        }
    public static void main(String arg[])
        {
            sll my=new sll();
            my.inserte(23);
            my.inserte(24);
            my.insertf(22);
            my.display();
            my.deletef();
            my.display();
            my.deletee();
            my.display();

        }
}