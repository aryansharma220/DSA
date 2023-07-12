import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // count(sc.next());
        int result=Euclidean(sc.nextInt(),sc.nextInt());
        // boolean result = isPalin(sc.nextInt());
        System.out.println(result);
        sc.close();
    }

    // static void count(String n){
    //     System.out.println(n.length());
    // }

    // static int countDigits(int x){
    //     int res=0;
    //     while(x>0){
    //         x=x/10;
    //         res++;
    //     }
    //     return res;
    // }

    // static boolean isPalin(int x){
    //     if(x<10) return false;
    //     String str = Integer.toString(x);
    //     boolean res = true;
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i)!=str.charAt(str.length()-(i+1))){
    //             res=false;
    //             break;
    //         }
    //     }
    //     return res;
    // }

    // static boolean isPalinn(int x){
    //     if(x<10) return false;
    //     int res=0;
    //     int temp=x;
    //     while(x>0){
    //         res=res*10+x%10;
    //         x=x/10;
    //     }
    //     return (temp==res);
    // }

    // static int fact(int n){
    //     if(n==1 || n==0) return 1;
    //     return n*fact(n-1);
    // }

    // static int trailZero(int n){
    //     int res=0;
    //     for(int i=5;i<=n;i*=5){
    //         res+=n/i;
    //     }
    //     return res;
    // }

    static int countDigits(int n){
        int res=0;
        while(n>0){
            n=n/10;
            res++;
        }
        return res;
    }

    static boolean isPalin(int n){
        int rev=0;
        int temp=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return (temp==rev);
    }

    static int facto(int n){
        int res=1;
        // if(n==0 || n==1) return 1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }

    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }

    static int trailZeros(int n){
        int res=0;
        for(int i=5;i<=n;i*=5){
            res+=n/i;
        }
        return res;
    }

    static int naiveGCD(int a, int b){
        int res =Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0) break;
            res--;
        }
        return res;
    }

    static int Euclidean(int a, int b){
        if(b==0) return a;
        else return Euclidean(b,a%b);
    }
}
