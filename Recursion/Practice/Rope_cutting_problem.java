import java.util.Scanner;

public class Rope_cutting_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =cuts(23,12,9,11);
        System.out.println(res);
        sc.close();
    }

    static int cuts(int n, int a, int b, int c){
            if (n==0) return 0;
            if (n<0) return -1;
            int re = Math.max(cuts(n-a, a, b, c),cuts(n-b, a, b, c));
            int res = Math.max(re, cuts(n-c, a, b, c));
            if (res == -1) return -1;
            return res+1;
    }
}
