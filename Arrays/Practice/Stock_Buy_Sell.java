public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] arr={1,5,3,8,12};
        // int res= naiveMethod(arr, 0, arr.length-1);
        // System.out.println(res);
        betterMethod(arr);
    }

    static int naiveMethod(int[]arr, int start, int end){
        if(end<=start) return 0;
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int curProfit=(arr[j]-arr[i])+ 
                    naiveMethod(arr, start, i-1)+
                    naiveMethod(arr, j+1, end);
                    profit=Math.max(profit,curProfit);
                }
            }
        }
        return profit;
    }

    static void betterMethod(int[] arr){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=(arr[i]-arr[i-1]);
            }
        }
        System.out.println(profit);
    }
}
