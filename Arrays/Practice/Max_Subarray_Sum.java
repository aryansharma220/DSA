public class Max_Subarray_Sum {
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
        int result=efficient(arr);
        System.out.println(result);
    }

    static int naive(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
            }
            res=Math.max(res,sum);
        }
        return res;
    }

    static int efficient(int arr[]){
        int res=arr[0];
        int maxEnd=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnd = Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(maxEnd,res);
        }
        return res;
    }
}
