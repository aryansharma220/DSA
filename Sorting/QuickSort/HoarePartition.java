public class HoarePartition {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
        int res=hoarePartition(arr, 0, arr.length-1);
        System.out.println(res);
    }

    static int hoarePartition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
