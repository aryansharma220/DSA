// Here method fact2 is better than fact1, both have O(n) time complexity but we have O(n) auxilary space in fact1 but O(1) in fact2 , so fact2 is better algorithm than fact1.


import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = trailingZeros(sc.nextInt());
        System.out.println(result);
        sc.close();
    }

    public static int fact1(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact1(n-1);
    }

    public static int fact2(int n){
        int num=1;
        for(int i=2;i<=n;i++){
            num*=i;
        }
        return num;
    }

    public static int trailingZeros(int num){
        int zeros=0;
        for(int i=5;i<=num;i=i*5){
            zeros=zeros+num/i;
        }
        return zeros;
    }
}
