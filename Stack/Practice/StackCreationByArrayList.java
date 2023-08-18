import java.util.ArrayList;

class myStack{
    ArrayList<Integer> arr;
    // int top;
    myStack(){
        // top=-1;
        arr=new ArrayList<>();
    }

    void push(int x){
        // top++;
        arr.add(x);
    }

    int pop(){
        int res=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return res;
    }

    int peek(){
        return arr.get(arr.size()-1);
    }

    boolean isEmpty(){
        return arr.isEmpty();
    }

    int sizeOf(){
        return arr.size();
    }
}

public class StackCreationByArrayList {
    public static void main(String[] args) {
        myStack s= new myStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.sizeOf());
    }
}
