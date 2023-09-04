public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={23,1,43,12,16};
        int size=arr.length;
        selectionSort(arr, size);
        print(arr);
    }

    static void selectionSort(int arr[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
            }
        }
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
