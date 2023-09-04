public class CountInversionArray {
    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        int result=countInverseNaive(arr);
        System.out.println(result);
    }

    static int countInverseNaive(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }
}
