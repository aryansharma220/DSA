class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
    data=x;
    } 
}
public class ReverseList {
    public static void main(String[] args) {
        Node head= null;
        head=push(head, 10);
        head=push(head, 20);
        head=push(head, 30);
        head=push(head, 40);
        head= reverse(head);
        printList(head);
    }

    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node curr=head, temp=null;
        while(curr.next!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        return temp.prev;
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
