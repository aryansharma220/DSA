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
        System.out.println("Item pushed -> "+head.data);
        size++;
    }

    int pop(){
        if(head==null) return Integer.MAX_VALUE;
        int res=head.data;
        // Node temp=head;
        head=head.next;
        size--;
        System.out.print("Item popped -> ");
        return res;
    }

    int peek(){
        if(head==null) return Integer.MAX_VALUE;
        System.out.print("Item on top -> ");
        return head.data;
    }

    boolean isEmpty(){
        return (head==null);
    }

    int size(){
        System.out.print("Size of stack -> ");
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
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}
