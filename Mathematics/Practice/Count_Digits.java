import java.util.Scanner;

public class Count_Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count(sc.next());
        sc.close();
    }
    public static void count(String str){
        System.out.println(str.length());
    }
}