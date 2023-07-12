public class Maximum_difference {
    public static void main(String[] args) {
        int[] arr={7,9,5,6,3,2};
        betterMethod(arr);
    }

    static void naiveMethod(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>max) max=arr[j]-arr[i];
            }
        }
        System.out.println(max);
    }

    static void betterMethod(int[] arr){
        int res=arr[1]-arr[0];
        int minValue=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(res, arr[j]-minValue);
            minValue=Math.min(minValue, arr[j]);
        }
        System.out.println(res);
    }
}
