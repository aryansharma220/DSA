import java.util.Scanner;

public class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sum(n);
        System.out.println(num);
        sc.close();
    }

    public static int sum(int n){
        return n*(n+1)/2;
    }
}