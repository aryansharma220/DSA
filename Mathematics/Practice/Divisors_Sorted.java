public class Divisors_Sorted {
    public static void main(String[] args) {
        efficientCheck(100);
    }

    static void naiveCheck(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i) System.out.println(n/i);
            }
        }
        // if() System.out.println();
    }

    static void efficientCheck(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0) System.out.println(i);
        }
        for(;i>=1;i--){
            if(n%i==0) System.out.println(n/i);
        }
    }
}
