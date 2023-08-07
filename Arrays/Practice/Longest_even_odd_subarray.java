public class Longest_even_odd_subarray {
    public static void main(String[] args) {
        int arr[]={5,10,20,6,3,8};
        int res=kadaneAlgo(arr);
        System.out.println(res);
    }

    static int naive(int arr[]){
        int res=1;
        for(int i=0;i<arr.length;i++){
            int curr=1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) curr++;
                else break;
                res=Math.max(res, curr);
            }
        }
        return res;
    }

    // Kadane's Algorithm is part of the Dynamic Programming
    // Kadane's Algorithm says that local_maximum at index i is the maximum of A[i] and the sum of A[i] and local_maximum at index i-1
    static int kadaneAlgo(int arr[]){
        int res=1;
        int curr=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res=Math.max(res, curr);
            }
            else curr=1;
        }
        return res;
    }

}
