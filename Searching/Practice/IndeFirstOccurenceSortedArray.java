public class IndeFirstOccurenceSortedArray {
    public static void main(String[] args) {
        int arr[]={5,10,10,10,15,20,14,10,15};
        int result=efficientIterative(arr, 15);
        System.out.println(result);
    }

    static int naive(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }

    static int efficientRecursive(int arr[], int x,int low, int high){
        // int low=0, high=arr.length-1;
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]>x) return efficientRecursive(arr, x,low,mid-1);
        else if(arr[mid]<x) return efficientRecursive(arr, x, mid+1, high);
        else{
            if(mid==0 || arr[mid]!=arr[mid-1]) return mid;
            else return efficientRecursive(arr, x,low,mid-1);
        }
    }

    static int efficientIterative(int arr[], int x){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x>arr[mid]) low=mid+1;
            else if(x<arr[mid]) high =mid-1;
            else{
                if(mid==0 ||arr[mid]!=arr[mid-1]) return mid;
                else high= mid-1;
            }
        }
        return -1;
    }
}
