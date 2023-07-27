
public class Array_max_cons_1s {
    public static void main(String[] args) {
        int arr[] ={1,1,1,1};
        int result =max1s(arr);
        System.out.println(result);
    }

    static int max1s(int arr[]){
        int count=0;
        int curr_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) curr_count=0;
            else{
                curr_count++;
                count=Math.max(curr_count,count);
            } 
        }
        return count;
    }
}
