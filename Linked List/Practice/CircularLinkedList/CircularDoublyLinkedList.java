class Node{
    int data;
    Node prev, next;
    Node(int x){
        data=x;
    }
}


public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        Node temp4=new Node(50);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=head;
        head.prev=temp4;
        temp1.prev=head;
        temp2.prev=temp1;
        temp3.prev=temp2;
        temp4.prev=temp3;
        head=insertEnd(head, 5);
        printList(head);
    }

    static Node insertBegin(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.prev=temp;
            temp.next=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }

    static Node insertEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.prev=temp;
            temp.next=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;
    }

    static void printList(Node head){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }
}
