import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean result = palin(num);
        System.out.println(result);
        sc.close();
    }

    public static Boolean palin(int n){
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-(i+1))){
                return false;
            }
        }
        return true;
    }
}
