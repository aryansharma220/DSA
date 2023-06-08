public class Sorted_array{
    public static void main(String[] args) {
        int[] arr = {10,1,10,10};
        boolean res= isSorted(arr);
        System.out.println(res);
    }

    static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}