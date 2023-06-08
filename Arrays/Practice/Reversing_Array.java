public class Reversing_Array {
    public static void main(String[] args) {
        int[] arr = {30,5,20};
        leftOneRotate(arr);
    }

    static void reverseArray(int[] arr){
        for(int i=0;i<=arr.length/2-1;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
        System.out.print("{");
        for(int element :arr){
            System.out.print(element+" ");
        }
        System.out.print("}");
    }

    static int removeDuplicate(int[] arr){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    static void zeroesEnd(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for(int element : arr) System.out.print(element+" ");
    }

    static void leftOneRotate(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int element : arr) System.out.print(element+" ");
    }
}
