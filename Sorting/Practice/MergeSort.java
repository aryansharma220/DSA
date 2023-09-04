public class MergeSort{
    public static void main(String[] args) {
        int A[]={12,4,2,6,32,16,9,5};
        printList(A);
        int low=0;
        int high=A.length-1;
        mergeSort(A, low, high);
        System.out.println();
        printList(A);
    }

    static void printList(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+ " ");
        }
    }

    static void merge(int A[],int mid,int low,int high){
        int i,j,k;
        int[] B=new int[high-low+1];
        i=low;
        j=mid+1;
        k=low;
        while(i<=mid && j<=high){
            if(A[i]<A[j]){
                B[k]=A[i];
                i++;k++;
            }
            else{
                B[k]=A[j];
                j++;k++;
            }
        }
        while(i<=mid){
            B[k]=A[i];
            i++;k++;
        }
        while(j<=high){
            B[k]=A[j];
            j++;k++;
        }

        for(i=low;i<=high;i++){
            A[i]=B[i];
        }
    }

    static void mergeSort(int A[], int low, int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            mergeSort(A, low, mid);
            mergeSort(A, mid+1, high);
            merge(A, mid, low, high);
        }
    }
}