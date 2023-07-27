public class Digits_in_Factorial {
    public static void main(String[] args) {
        int result = digitsInFactorial(5);
        System.out.println(result);
    }

    static int digitsInFactorial(int N){
        // code here
        if(N<0) return 0;
        if(N<=1) return 1;
        double x = (N * Math.log10(N / Math.E) + Math.log10(2 * Math.PI * N) / 2.0);  // Stirling’s approximation formula
        return (int) Math.floor(x) + 1;
    }
}
