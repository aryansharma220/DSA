public class CountOccurSortedArray {
    public static void main(String[] args) {
        int arr[]={5,10,10,10,10,20,20,30};
        int result=efficient(arr, 10);
        System.out.println(result);
    }

    static int naive(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) count++;
        }
        return count;
    }

    static int efficient(int arr[], int x){
        int first=firstOcc(arr, x);
        if(first==-1) return 0;
        else return (lastOcc(arr, x)-first+1);
    }

    static int firstOcc(int arr[], int x){
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

    static int lastOcc(int arr[], int x){
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
