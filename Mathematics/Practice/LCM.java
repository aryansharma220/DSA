/**
 * The LCM class calculates the least common multiple (LCM) of two numbers using both a naive and
 * efficient method.
 */
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = LCMEff(4,6);
        System.out.println(result);
        sc.close();
    }

    static int LCMnaive(int a, int b){
        int res= Math.max(a, b);
        while(true){
            if((res%a==0)&& (res%b==0)) return res;
            res++;
        }
    }

    // Efficient method works on the formula --> a*b = GCD(a,b)*LCM(a,b) 
    // Time complexity --> log(min(a,b))
    static int LCMEff(int a , int b){
        return a*b/euclideanAlgoEff(a, b);
    }

    static int euclideanAlgoEff(int a, int b){
        if(b==0) return a;
        else return euclideanAlgoEff(b, a%b);
    }
}
