

public class Recur_ex {
    public static void main(String[] args) {
        fun2(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }

    // Decimal to binary conversion
    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n/2);
        System.out.println(n%2);
    }
}
