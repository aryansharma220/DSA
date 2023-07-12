/**
 * The primeFactors class in Java calculates and prints the prime factors of a given number using a
 * naive approach.
 */
public class primeFactors {
    public static void main(String[] args) {
        factorsNaive(12);
    }

    static void factorsNaive(int n){
        for(int i =2; i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.println(i);
                    x*=i;
                }
            }
        }
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}


