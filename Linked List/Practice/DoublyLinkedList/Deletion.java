class Node{
    int data;
    Node prev, next;
    Node(int x){
        data=x;
    }
}

public class Deletion {
    public static void main(String[] args) {
        Node head=null;
        head= push(head, 40);
        head= push(head, 30);
        head= push(head, 20);
        head= push(head, 10);
        head=deleteLast(head);
        printList(head);
    }

    static Node deleteHead(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        head=head.next;
        head.prev=null;
        return head;
    }

    static Node deleteLast(Node head){
        if(head==null) return null;
        else if(head.next==null) return null;
        else{
            Node temp=null;
            Node curr=head;
            while(curr.next.next!=null) curr=curr.next;
            curr.next.prev=temp;
            curr.next=null;
            return head;
        }
    }
    static Node push(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        if(head!=null) head.prev=temp;
        return temp;
    }

    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
