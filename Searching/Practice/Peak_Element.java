public class Peak_Element {
    public static void main(String[] args) {
        int arr[]={1,10,20,30,40,20,30,50};
        int result=peakElementFinder(arr);
        System.out.println(result);
    }

    static int naive(int arr[]){
        int n = arr.length-1;
        if(n==1) return arr[0];
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n]>arr[n-1]) return arr[n];
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;  
    }

    static int peakElementFinder(int arr[]){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==high || arr[mid]>arr[mid+1])) return mid;
            if(mid>0 && arr[mid-1]>=arr[mid]) high = mid-1;
            else low=mid+1; 
        }
        return -1;
    }
}
