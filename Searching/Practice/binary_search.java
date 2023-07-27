public class binary_search {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,70};
        int result = bsearchRecursive(arr, 30,0,6);
        System.out.println(result);
    }

    static int bSearchIterative(int arr[], int x){
    int low=0, high = arr.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x) high = mid-1;
        else low = mid+1;
    }
    return -1;
    }

    static int bsearchRecursive(int arr[], int x, int low, int high){
    if(low>high) return -1;
    int mid=(low+high)/2;
    if(arr[mid]==x) return mid;
    else if(arr[mid]>x) return bsearchRecursive(arr, x, low, mid-1);
    else return bsearchRecursive(arr, x, mid+1, high);
    }
}
