public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n =arr.length;
        print(arr,n);
        bubbleSort(arr, n);
        System.out.println();
        print(arr,n);
    }

    static void print(int[] arr, int n){
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }

    static void bubbleSort(int[] arr, int n){
        int isSorted=0;
        for(int i=0;i<n;i++){
            isSorted=1;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=0;
                }
            }
            if(isSorted==1){return;}
        }
    }

}
