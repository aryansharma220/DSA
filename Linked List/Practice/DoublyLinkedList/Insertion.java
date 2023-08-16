class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
    }
}

public class Insertion {
    public static void main(String[] args) {
        Node head=null;
        head=push(head, 40);
        head=push(head, 30);
        head=push(head, 20);
        head=push(head, 10);
        head=insertAtEnd(head, 50);
        printList(head);
    }

    public static Node push(Node head, int x){
        Node curr=new Node(x);
        // curr.prev=null;
        curr.next=head;
        if(head!=null) head.prev=curr;
        return curr;
    }

    public static Node insertAtEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null) return temp;
        Node curr=head;
        while(curr.next!=null) curr=curr.next;
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    public static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
