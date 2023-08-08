public class SearchInfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,10,15,20,40,50,90,100,120,150};
        int result=efficientMethod(arr, 100);
        System.out.println(result);
    }

    static int naive(int arr[], int x){
    int i=0;
    while(arr[i]<=x){
        i++;
        if(arr[i]==x) return i;
    }
    return -1;
    }

    // Unbounded Binary Search --> Time complexity O(log(position))

    static int efficientMethod(int arr[], int x){
        if(arr[0]==x) return 0;
        int i=1;
        while(arr[i]<x){
            i*=2;
            if(arr[i]==x) return i;
        }
        return binarySearch(arr,x,i/2+1,i-1);
    }

    static int binarySearch(int arr[], int x, int low, int high){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
