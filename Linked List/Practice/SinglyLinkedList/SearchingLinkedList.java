class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class SearchingLinkedList {

    static int i=1;
    public static void main(String[] args) {
        Node head=null;
        head=push(head, 40);
        head=push(head, 30);
        head=push(head, 20);
        head=push(head, 10);
        // printList(head);
        int result =searchIterative(head, 1400);
        System.out.println(result);

    }

    static Node push(Node head, int x){
        Node curr =new Node(x); 
        curr.next=head;
        return curr;
    }

    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    static int searchIterative(Node head, int x){
        int i=1;
        while(head!=null){
            if(head.data==x) return i;
            head=head.next;
            i++;
        }
        return -1;
    }

    static int searchRecursive(Node head, int x){
        if(head==null) return -1;
        if(head.data==x) return i;
        i++;
        return searchRecursive(head.next,x);
    }
}
