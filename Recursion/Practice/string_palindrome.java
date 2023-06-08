import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =sumOfDigits(9987);
        System.out.println(res);
        sc.close();
    }

    static boolean palin(String str,int start, int end){
        if(start>=end) return true;
        return str.charAt(start)==str.charAt(end) && palin(str, start+1, end-1);
    }
    
    static int sumOfDigits(int n){
        if(n<10) return n;
        return n%10+sumOfDigits(n/10);
    }
}
