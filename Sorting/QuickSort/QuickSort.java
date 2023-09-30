public class QuickSort{
    public static void main(String[] args) {
        int arr[]={10,2,5,112,23,1,23,12,43,54};
        int hi=arr.length-1;
        print(arr);
        System.out.println();
        quickSort(arr, 0, hi);
        print(arr);
    }

    static void print(int[] arr){
        for(int ele:arr){System.out.print(ele+" ");}
    }

    static void quickSort(int[] arr, int lo, int hi){
        int partitionIndex;
        if(lo<hi){
            partitionIndex=partition(arr,lo,hi);
            quickSort(arr,lo,partitionIndex-1);
            quickSort(arr,partitionIndex+1,hi);
        }
    }

    static int partition(int[] arr, int lo, int hi){
        int pivot=arr[lo];
        int i=lo+1;
        int j=hi;
        int temp;
        do{
            while(i <= j && arr[i]<=pivot){i++;}
            while(arr[j]>pivot){j--;}
            if(j>i){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }while(i<=j);
        temp=arr[lo];
        arr[lo]=arr[j];
        arr[j]=temp;
        return j;
    }
}