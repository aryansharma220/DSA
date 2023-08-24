class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
    }
}

class myQueue{
    int size;
    Node front, rear;
    myQueue(){
        front=rear=null;
        size=0;
    }

    void enqueue(int x){
        Node temp=new Node(x);
        size++;
        if(front==null) front=rear=temp;
        else{
            rear.next=temp;
            rear=temp;
        }
    }

    void dequeue(){
        if(front==null) return;
        front=front.next;
        if(front==null) rear=null;
        size--;
    }

    int size(){
        return size;
    }

    int getFront(){
        return front.data;
    }

    int getRear(){
        return rear.data;
    }

}


public class ImplementationUsingLL {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.size());
        // q.dequeue();
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
