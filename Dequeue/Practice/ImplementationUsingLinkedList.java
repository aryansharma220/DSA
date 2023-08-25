class Node{
    int data;
    Node next,prev;
    Node(int x){
        data=x;
    }
}

class myDequeue{
    Node head,curr;
    int front,back,size;
    myDequeue(){
        head=curr=null;
        front=0;
        back=-1;
        size=0;
    }

    Node insertFront(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
        back++;
        return head;
    }

    Node deleteFront(){
        head=head.next;
        size--;
        front++;
        return head;
    }

    Node insertBack(int x){
        Node temp=new Node(x);
        temp.next=curr;
        curr.prev=temp;
        curr=temp;
        size++;
        back++;
        return head;
    }

    Node deleteBack(){
        curr.prev=null;
        back--;
        size--;
        return head;
    }
}

public class ImplementationUsingLinkedList {
    public static void main(String[] args) {
        Node head=null;
        myDequeue q =new myDequeue();
        head=q.insertFront(20);
        head=q.insertFront(10);
        head=q.insertBack(30);
        head=q.insertBack(40);
        head=q.deleteBack();
        head=q.deleteFront();
        print(head);
    }

    static void print(Node head){
        while(head.next!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
