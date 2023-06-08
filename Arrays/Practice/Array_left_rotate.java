public class Array_left_rotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        leftRotate(arr, 2);
    }

    static void leftRotate(int[] arr, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int element : arr) System.out.print(element+" ");
    }

    static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
        }
    }
}
