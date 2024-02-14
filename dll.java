class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
            {
                this.data=data;
                this.next=null;
                this.prev=null;
            }
    }

public class dll
    {
        Node head;
        dll()
            {
                this.head=null;
            }
        public void insertf(int data)
            {
                Node newnode=new Node(data);
                if(head==null)
                    {
                        head=newnode;
                    }
                else    
                {
                    newnode.next=head;
                    head.prev=newnode;
                    head=newnode;
                }
            }
        
        public void inserte(int data)
            {
                Node newnode=new Node(data);
                if(head==null)
                    head=newnode;
                else
                    {
                        Node temp=head;
                        while(temp.next!=null)
                            temp=temp.next;
                        temp.next=newnode;
                        newnode.prev=temp;
                    }
            }
            
        public void deletef()
            {
                if(head==null)
                    return;
                else
                    {
                        head=head.next;
                        head.prev=null;
                    }
            }
        public void deletee()
            {
                Node temp=head;
                Node ptr=null;
                if(head==null)
                    return;
                else
                    {
                        while(temp.next!=null)
                        {
                            ptr=temp;
                            temp=temp.next;
                        }
                        ptr.next=null;
                        temp.prev=null;
                    }
            }
        public void display()
            {
                Node temp=head;
                System.out.println("\n");
                while(temp!=null)
                    {
                        System.out.print(temp.data+"\t");
                        temp=temp.next;
                    }
                }
        public static void main(String arg[])
            {
                dll my=new dll();
                my.inserte(22);
                my.inserte(24);
                my.insertf(20);
                my.inserte(26);
                my.inserte(28);
                my.display();
                my.deletee();
                my.display();
                my.deletef();
                my.display();

            }
                
    }
