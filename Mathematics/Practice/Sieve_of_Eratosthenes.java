import java.util.Arrays;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        optimizedSieve(23);
    }

    static void naive(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)) System.out.println(i);
        }
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }


    // Time complexity - nloglogn
    static void algoSieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]) System.out.println(i);
        }
    }

    static void optimizedSieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
    }
}
