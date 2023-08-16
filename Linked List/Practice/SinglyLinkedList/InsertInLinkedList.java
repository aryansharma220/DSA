class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertInLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head= insertBeginning(head, 30);
        head= insertBeginning(head, 20);
        head= insertBeginning(head, 10);
        head= insertAtEnd(head, 50);
        head= insertAtGivenIndex(head,2, 100);
        printList(head);
    }

    public static Node insertBeginning(Node head, int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }

    public static Node insertAtEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null) return temp;
        Node p=head;
        while(p.next!=null){
            p=p.next;
        }
        p.next=temp;
        return head;
    }

    public static Node insertAtGivenIndex(Node head, int pos, int x){
        Node temp=new Node(x);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr.next!=null;i++)
            curr=curr.next;
        if(curr==null) return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;

    }
    public static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
