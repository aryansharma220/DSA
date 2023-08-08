public class SearchSortedRotatedArray {
    public static void main(String[] args) {
        int arr[]={100,200,300,400,20,30,40};
        int result=usingBinarySearch(arr, 50);
        System.out.println(result);
    }

    static int naive(int arr[], int x){
        int i=0;
        try{
            while(true){
                if(arr[i]==x) return i;
                i++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            return -1;
        }
    }

    static int usingBinarySearch(int arr[], int x){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            if(arr[low]<arr[mid]){
                if(x>arr[low] && x<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(x>arr[mid] && x<arr[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}
