public class IndexLastOccurenceSortedArray {
    public static void main(String[] args) {
        int arr[]={5,10,10,10,14,14,15};
        int result=effectiveIterative(arr, 10);
        System.out.println(result);
    }

    static int naive(int arr[], int x){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x) return i;
        }
        return -1;
    }

    static int effectiveRecursive(int arr[], int x, int low, int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(x<arr[mid]) return effectiveRecursive(arr,x,low,mid-1);
        else if(x>arr[mid]) return effectiveRecursive(arr,x,mid+1,high);
        else{
            if(mid==arr.length || arr[mid]!=arr[mid+1]) return mid;
            else return effectiveRecursive(arr,x,mid+1,high);
        }
    }

    static int effectiveIterative(int arr[], int x){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x<arr[mid]) high=mid-1;
            else if(x>arr[mid]) low=mid+1;
            else{
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1]) return mid;
                else low=mid+1;
            }
        }
        return -1;
    }
}
