/**
 * The CheckPrime class contains two methods, isPrimeNaive and isPrimeEff, which check if a given
 * number is prime using different algorithms.
 */
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = isPrimeEff(35);
        System.out.println(result);
        sc.close();
    }

    static boolean isPrimeNaive(int n){
        if(n<=1) return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static boolean isPrimeEff(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    
}
