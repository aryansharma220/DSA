class myStack{
    int top;
    int arr[];
    myStack(int x){
        arr= new int[x];
        top=-1;
    }
    void push(int x){
        if(top+1>=x) System.out.print("Stack Overflow");
        top++;
        arr[top]=x;
    }

    int pop(){
        if(top==-1){
            System.out.print("Stack Underflow");
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }

    void peek(){
        if(top==-1) return;
        System.out.print(arr[top]);
    }
    
    int sizeOf(){
        return (top+1);
    }
    boolean isEmpty(){
        return (top==-1);
    }
}

public class StackCreationByArray{
    public static void main(String[] args) {
        myStack s= new myStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        System.out.println();
        System.out.println(s.pop());
        s.peek();
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.sizeOf());
    }
}