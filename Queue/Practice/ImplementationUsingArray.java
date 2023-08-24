// class myQueue{
//     int[] arr;
//     int front;
//     int rear;
//     int size,cap;
//     myQueue(int s){
//         cap=s;
//         arr= new int[cap];
//         size=0;
//         front=0;
//         rear=0;
//     }

//     void enqueue(int x){
//         if(rear==0) front++;
//         arr[rear]=x;
//         rear++;
//     }

//     int dequeue(){
//         if(rear==0) return -1;
//         int res=arr[rear];
//         rear--;
//         return res;
//     }

//     int size(){
//         return rear;
//     }

//     int getFront(){
//         return arr[front];
//     }

//     int getRear(){
//         return arr[rear];
//     }

//     boolean isFull(){
//         return (rear==size);
//     }

//     boolean isEmpty(){
//         return (front==0);
//     }
// }


// public class ImplementationUsingArray{
//     public static void main(String[] args) {
//         myQueue q =new myQueue(5);
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.enqueue(40);
//         System.out.println(q.size());
//         // q.enqueue(50);
//         System.out.println(q.isFull());
//         System.out.println(q.dequeue());
//         System.out.println(q.isEmpty());
//         System.out.println(q.getFront());
//         System.out.println(q.getRear());
//     }
// }

class myQueue{
    int arr[];
    int front,cap,size;
    myQueue(int c){
        cap=c;
        arr=new int[cap];
        front=0;
        size=0;
    }

    void enqueue(int x){
        if(isFull()){
            // System.out.println("OverFlow");
            return;
        }
        int rear = getRear();
        rear=(rear+1)%cap;
        // if(size==-1) front++;
        arr[rear]=x;
        size++;
    }

    void dequeue(){
        if(isEmpty()) return;
        front=(front+1)%cap;
        size--;
    }

    int size(){
        return cap;
    }

    int getFront(){
        if(isEmpty()) return -1;
        else return arr[front];
    }

    int getRear(){
        if(isEmpty()) return -1;
        else return arr[(front+size-1)%cap] ;
    }

    boolean isFull(){
        return (size==cap);
    }

    boolean isEmpty(){
        return (size==0);
    }
}

public class ImplementationUsingArray{
    public static void main(String[] args) {
        myQueue q= new myQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.isFull());
        // q.dequeue();
        System.out.println(q.isEmpty());
        System.out.println(q.getFront());
        System.out.println(q.getRear());

    }
}