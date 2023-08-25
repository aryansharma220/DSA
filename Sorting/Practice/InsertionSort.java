public class InsertionSort{
    public static void main(String[] args) {
        int[] arr={9,3,53,1,83,2};
        print(arr);
        insertionSortAcsending(arr);
        System.out.println();
        print(arr);
        insertionSortDescending(arr);
        System.out.println();
        print(arr);
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionSortAcsending(int arr[]){
        int key,j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    static void insertionSortDescending(int arr[]){
        int key,j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}