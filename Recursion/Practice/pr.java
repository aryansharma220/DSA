public class pr {
    public static void main(String[] args) {
        int result = ropeCut(23,12,9,11);
        System.out.println(result);
    }

    // static int ropeCuts(int n, int a, int b, int c){
    //     if(n==0) return 0;
    //     if(n<0) return -1;
    //     int res = Math.max(Math.max(ropeCuts(n-a, a, b, c),ropeCuts(n-b, a, b, c)),ropeCuts(n-c, a, b, c));
    //     if(res==-1) return-1;
    //     return res+1;
        
    // }

    static int ropeCut(int n, int a, int b, int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res = Math.max(Math.max(ropeCut(n-a, a, b, c),ropeCut(n-b, a, b, c)),ropeCut(n-c, a, b, c));
        if(res==-1) return -1;
        return res+1;
    }


















}
