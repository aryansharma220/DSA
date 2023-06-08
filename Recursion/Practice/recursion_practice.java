
public class recursion_practice {
    static int i=1;
    static int num=1;
    public static void main(String[] args) {
        int res =fib(6);
        System.out.println(res);
    }

    // Tail Recursive 
    static void dec(int n){  // time complexity and auxilary space is Theta(n)
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }

    // Not tail recursive
    static void asc(int n){  // time complexity and auxilary space is Theta(n)
        if(n==0){
            return;
        }
        System.out.println(n);
        asc(n-1);
    }

     // Tail recursive
    static void asctr(int n){  // time complexity and auxilary space is Theta(n)
        if(n==0){
            return;
        }
        System.out.println(i);
        i++;
        asctr(n-1);
    }

    //Tail recursive factorial function
    static int fact(int n,int num){
        if(n==0 || n==1){
            return num;
        }
        return fact(n-1,num*n);
    }

    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
