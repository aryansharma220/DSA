import java.util.ArrayDeque;

public class StackBuiltIn {
    public static void main(String[] args) {
        ArrayDeque<Integer> s= new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}
