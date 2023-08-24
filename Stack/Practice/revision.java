// class myQueueArray{
//     int[] arr;
//     int top;
//     myQueueArray(int c){
//         arr=new int[c];
//         top=-1;
//     }

//     void push(int x){
//         if(top+1>x) System.out.println("Stack Overflow");;
//         top++;
//         arr[top]=x;
//     }

//     int pop(){
//         if(top==-1) return Integer.MAX_VALUE;
//         int res=arr[top];
//         top--;
//         return res;
//     }

//     int peek(){
//         if(top==-1) return Integer.MAX_VALUE;
//         return arr[top];
//     }

//     int sizeOf(){
//         return top+1;
//     }

//     boolean isEmpty(){
//         return (top==-1);
//     }
// }

// import java.util.ArrayList;

// class myQueueArrayList{
//     ArrayList<Integer> arr;
//     myQueueArrayList(){
//         arr=new ArrayList<Integer>();
//     }

//     void push(int x){
//         arr.add(x);
//     }

//     int pop(){
//         int res=arr.get(arr.size()-1);
//         arr.remove(arr.size()-1);
//         return res;
//     }

//     int peek(){
//         return arr.get(arr.size()-1);
//     }

//     int sizeOf(){
//         return arr.size();
//     }

//     boolean isEmpty(){
//         return arr.isEmpty();
//     }

// }

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class myQueueLinked {
    int size;
    Node head;

    myQueueLinked(Node head) {
        head = null;
        size = 0;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek() {
        if (head == null)
            return Integer.MAX_VALUE;
        return head.data;
    }

    int sizeOf() {
        return size;
    }

    boolean isEmpty() {
        return (head == null);
    }
}

public class revision {
    public static void main(String[] args) {
        Node head = null;
        myQueueLinked q = new myQueueLinked(head);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.push(60);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
        System.out.println(q.sizeOf());
    }
}