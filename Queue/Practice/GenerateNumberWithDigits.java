import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumberWithDigits {
    public static void main(String[] args) {
        returnNumber(1220);
    }

    static void returnNumber(int n){
        Queue<String> q= new ArrayDeque<>();
        q.add("5");
        q.add("6" );
        for(int count=0;count<n;count++){
            String curr=q.peek();
            System.out.println(curr);
            q.poll();
            q.add(curr+"5");
            q.add(curr+"6");
        }
    }
}
