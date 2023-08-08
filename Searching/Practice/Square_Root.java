public class Square_Root {
    public static void main(String[] args) {
        int result = sqRootBinary(7);
        System.out.println(result);
    }

    static int returnRoot(int x){
        return (int)(Math.sqrt(x));
    }

    static int sqRootNaive(int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return (i-1);
    }

    static int sqRootBinary(int x){
        int low=1, high=x, ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            // int msq=mid*mid;
            if(mid*mid==x) return mid;
            else if(mid*mid>x) high=mid-1;
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
