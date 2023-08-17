class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

public class Insertion {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp=new Node(20);
        Node temp2=new Node(30);
        head.next=temp;
        temp.next=temp2;
        temp2.next=head;
        head= insertBeginning(head, 5);
        head= insertAtEnd(head, 40);
        printList(head);
    }

    static Node insertBeginning(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int tempData=head.data;
        head.data=temp.data;
        temp.data=tempData;
        return head;
    }

    static Node insertAtEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int data=temp.data;
        temp.data=head.data;
        head.data=data;
        return temp;
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
