package Linked_List;
public class practise {
    Node head;
    Node tail;

    public void insertStart(int data){
        Node newNode= new Node(data);
        //! the address of the newly created node is stored in newNode

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }


    }
    public void insertLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void reverse(){
        if(head==null){
            return;
        }

        Node prev=null;
        Node curr=head;
        Node nextnode=null;

        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head=prev;
    }
    public static void main(String[] args) {
        practise linkedlist=new practise();
        linkedlist.insertStart(30);
        linkedlist.insertStart(50);
        linkedlist.insertLast(10);
        linkedlist.print();
        linkedlist.reverse();
        System.out.println();
        linkedlist.print();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}