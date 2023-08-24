import java.util.ArrayDeque;
import java.util.Queue;

public class ReversingQueue {
    public static void main(String[] args) {
        Queue<Integer> q1=new ArrayDeque<>();
        q1.offer(10);
        q1.offer(5);
        q1.offer(15);
        q1.offer(20);
        System.out.println(q1);
        reverse(q1);
        System.out.println(q1);
    }
    static void reverse(Queue<Integer> q1){
        ArrayDeque<Integer> s =new ArrayDeque<>();
        while(q1.isEmpty()==false){
            s.push(q1.remove());
        }
        while(s.isEmpty()==false){
            q1.add(s.pop());
        }
    }
}
