import java.util.Arrays;
import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // count(sc.next());
        // boolean result=isPalin(sc.next(),sc.nextInt(),sc.nextInt());
        // boolean result = checkPrime(sc.nextInt());
        int result = sumOfDigits(sc.nextInt(), 0);
        System.out.println(result);
        // print1toN(sc.nextInt());
        sc.close();
        // System.out.println((int)Math.pow(4,3));
    }

    static int sumOfDigits(int n, int k){
        if(n/10==0) return k+n%10;
        return sumOfDigits(n/10, k+n%10);
    }

    static int sumNatural(int n, int k){
        if(n==1) return k;
        return sumNatural(n-1, k+n);
    }

    static boolean isPalin(String s,int start, int end){
        if(start >= end) return true;
        else{
            return (s.charAt(start)== s.charAt(end)) && isPalin(s,start+1,end-1);
        }
    }

    static int fibbo(int n){
        if(n<=1) return n;
        return fibbo(n-1)+fibbo(n-2);
    }

    static void printNto1(int n){
        if(n==0) return;
        System.out.println(n);
        printNto1(n-1);
    }
    static int i=1;
    static void print1toN(int n){
        if(i>n) return;
        System.out.println(i);
        i++;
        print1toN(n);
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

    // static int countDigits(int n){
    //     int res=0;
    //     while(n>0){
    //         n=n/10;
    //         res++;
    //     }
    //     return res;
    // }

    // static boolean isPalin(int n){
    //     int rev=0;
    //     int temp=n;
    //     while(n>0){
    //         rev=rev*10+n%10;
    //         n=n/10;
    //     }
    //     return (temp==rev);
    // }

    // static int facto(int n){
    //     int res=1;
    //     // if(n==0 || n==1) return 1;
    //     for(int i=2;i<=n;i++){
    //         res*=i;
    //     }
    //     return res;
    // }

    // static int fact(int n){
    //     if(n==0 || n==1) return 1;
    //     return n*fact(n-1);
    // }

    // static int trailZeros(int n){
    //     int res=0;
    //     for(int i=5;i<=n;i*=5){
    //         res+=n/i;
    //     }
    //     return res;
    // }

    // static int naiveGCD(int a, int b){
    //     int res =Math.min(a, b);
    //     while(res>0){
    //         if(a%res==0 && b%res==0) break;
    //         res--;
    //     }
    //     return res;
    // }

    // static int Euclidean(int a, int b){
    //     if(b==0) return a;
    //     else return Euclidean(b,a%b);
    // }

    // static int LCM(int a, int b){
    //     return a*b/Euclidean(a,b);
    // }

    // static boolean isPrime(int a){
    //     if(a<=1) return false;
    //     if(a==2 || a==3) return true;
    //     if(a%2==0 || a%3==0) return false;
    //     for(int i=5;i*i<=a;i=i+6){
    //         if(a%i==0 || a%(i+2)==0) return false;
    //     }
    //     return true;
    // }

    static int printGCD(int a, int b){
        if(b==0) return a;
        else return printGCD(b, a%b);
    }

    static int printGCD2(int a, int b){
        int res=Math.min(a, b);
        while(true){
            if(a%res==0 && b%res==0) return res;
            res--;
        }
    }

    static int printLCM(int a, int b){
        return a*b/printGCD(a, b);
    }

    static int printLCM2(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0) return res;
            res++;
        }
    }

    static boolean checkPrime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

    static void printFactors(int n){
        if(n<=1) return;
        for(int i=2;i*i<=n;i++){
            // if(checkPrime(i)){
                while(n%i==0){
                    System.out.println(i);
                    n=n/i;
                }
        }
        if(n!=0) System.out.println(n);
    }

    static void printFactorsBetter(int n){
        if(n<=1) return;
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            if(n%(i+2)==0){
                System.out.println((i+2));
                n=n/(i+2);
            } 
        }
        if(n>3) System.out.println(n);
    }

    static void printDivisors(int n){
        int i;
        for(i=1;i*i<n;i++){
            if(n%i==0) System.out.println(i);
        }
        for(;i>0;i--){
            if(n%i==0) System.out.println(n/i);
        }
    }

    static void sieveAlgo(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j=j+i){
                isPrime[j]=false;
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]) System.out.println(i);
        }
    }

    static void sieveAlgoOpt(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
    }

    
}
