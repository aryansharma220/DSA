import java.util.Arrays;

public class MedianRowWiseSorted {
    public static void main(String[] args) {
        int arr[][]={{1,10,20},
                    {15,25,30},
                    {5,8,40}};
        int result =retMedian(arr);
        System.out.println(result);
    }

    static int retMedian(int arr[][]){
        int min=arr[0][0], max=arr[0][arr[0].length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<min) min=arr[i][0];
            if(arr[i][0]<min) max=arr[i][arr[0].length-1];
        }
        int medPos=(arr.length*arr[0].length+1)/2;
        while(min<max){
            int mid=(min+max)/2, midPos=0;
            for(int i=0;i<arr.length;i++){
                int pos=Arrays.binarySearch(arr[i],mid)+1;
                midPos+=Math.abs(pos);
            }
            if(midPos<medPos) min=mid+1;
            else max=mid;
        }
        return min;
    }
}
