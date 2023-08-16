class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
        prev=null;
        next=null;
    }
}

public class Creation {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.prev=head;
        head.next.next=new Node(30);
        head.next.prev=head.next;
    }
}
