public class Count1sSortedArray {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,1,1};
        int result=naive(arr);
        System.out.println(result);
    }

    static int naive(int arr[]){
        return(arr.length-1-lastOccerZero(arr));
    }

        static int lastOccerZero(int arr[]){
            int low=0, high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(0<arr[mid]) high=mid-1;
                else if(0>arr[mid]) low=mid+1;
                else{
                    if(mid==arr.length-1 || arr[mid]!=arr[mid+1]) return mid;
                    else low=mid+1;
                }
            }
            return -1;
        }
}
