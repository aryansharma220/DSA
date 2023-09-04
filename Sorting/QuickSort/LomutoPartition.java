public class LomutoPartition {
    public static void main(String[] args) {
        int arr[]={70,60,80,40,30};
        lomutoPartition(arr, 0, arr.length-1);
    }

    static void lomutoPartition(int arr[],int l, int h){
        int i=l-1,pivot=arr[h];
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
