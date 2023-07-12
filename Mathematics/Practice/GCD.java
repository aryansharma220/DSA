/**
 * The GCD class calculates the greatest common divisor (GCD) of two numbers using both a naive
 * approach and the Euclidean algorithm.
 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = euclideanAlgoEff(12,15);
        System.out.println(result);
        sc.close();
    }

    static int GCDnaive(int x, int y){
        int res = Math.min(x, y);
        while(res>0){
            if((x%res==0) && (y%res==0)) return res;
            res--;
        }
        return res;
    }

    static int euclideanAlgoNaive(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    static int euclideanAlgoEff(int a, int b){
        if(b==0) return a;
        else return euclideanAlgoEff(b, a%b);
    }
}
