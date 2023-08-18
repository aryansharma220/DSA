class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

class myStack{
    int size;
    Node head;
    myStack(Node head){
        head=null;
        size=0;
    }

    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }

    int pop(){
        if(head==null) return Integer.MAX_VALUE;
        int res=head.data;
        // Node temp=head;
        head=head.next;
        size--;
        return res;
    }

    int peek(){
        if(head==null) return Integer.MAX_VALUE;
        return head.data;
    }

    boolean isEmpty(){
        return (head==null);
    }

    int size(){
        return size;
    }
}

public class StackCreationByLinkedList {
    public static void main(String[] args) {
        Node head=null;
        myStack s=new myStack(head);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());

    }
}
