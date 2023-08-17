class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

public class Creation{
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp=new Node(20);
        Node temp2=new Node(30);
        head.next=temp;
        temp.next=temp2;
        temp2.next=head;
        printList(head);
    }

    static void printList(Node head){
        if(head==null) return;
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
}