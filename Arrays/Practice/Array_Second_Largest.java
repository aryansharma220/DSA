import java.util.Arrays;

public class Array_Second_Largest {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10};
        int res= otherMethod(arr);
        System.out.println(res);
    }

    static int secondLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    static int otherMethod(int[] arr){
        int res=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[largest]<arr[i]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
}
