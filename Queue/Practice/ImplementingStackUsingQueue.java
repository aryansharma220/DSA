import java.util.Queue;

class stack{
    Queue<Integer> q1, q2;
    int top(){return q1.peek();}
    int size(){ return q1.size();}
    int pop(){return q1.poll();}
    void push(int x){
        while(q1.isEmpty()==false){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(q2.isEmpty()==false){
            q1.offer(q2.peek());
            q2.poll();
        }
    }
}

public class ImplementingStackUsingQueue {
    public static void main(String[] args) {
        
    }
}
