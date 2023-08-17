class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

public class Deletion {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp=new Node(20);
        Node temp2=new Node(30);
        head.next=temp;
        temp.next=temp2;
        temp2.next=head;
        head=deleteKNode(head,1);
        printList(head);
    }

    static Node deleteBegin(Node head){
        if(head.next==head) return null;
        if(head.next==null) return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    static int i=1;
    static Node deleteKNode(Node head, int pos){
        if(head==null) return null;
        if(head.next==null && pos==1) return null;
        if(pos==1){
            return deleteBegin(head);
        } 
        Node curr=head;
        while(i+1!=pos){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
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
