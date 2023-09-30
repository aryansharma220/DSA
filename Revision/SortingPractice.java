public class SortingPractice{
    public static void main(String[] args){
        int arr[]={156,10,2,5,30,15,9,10};
        // System.out.print(arr[0]);
        System.out.print("Unsorted Array -> ");
        print(arr);
        System.out.println();
        selectionSort(arr);
        System.out.print("Sorted Array -> ");
        print(arr);
    }

    static void print(int arr[]){
        for(int element : arr){
            System.out.print(element+" ");
        }
            System.out.println();
    }

    static void bubbleSort(int arr[]){
        int temp;
        int isSorted;
        for(int i=0;i<arr.length;i++){
            isSorted=1;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=0;
                }
            }
                if(isSorted==1)return;
        }
    }

    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
            }
            print(arr);
        }
    }

    static void insertionSort(int arr[]){
        
    }
}