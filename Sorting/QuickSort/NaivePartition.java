public class NaivePartition {
    public static void main(String[] args) {
        int arr[]={3,8,6,12,10,7};
        partition(arr,0,5,5);
        print(arr);

    }

    static void partition(int arr[],int l,int h, int p){
        int temp[]=new int[h-l+1],index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){ temp[index]=arr[i];index++;}
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){ temp[index]=arr[i];index++;}
        }
        for(int i=l;i<=h;i++){arr[i]=temp[i-l];}
    }

    static void print(int arr[]){
        System.out.print("{ ");
        for(int element:arr)System.out.print(element+" ");
        System.out.print("}");
    }

}
