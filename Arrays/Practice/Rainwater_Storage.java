public class Rainwater_Storage {
    public static void main(String[] args) {
        int[] arr={5,0,6,2,3};
        int res=solution(arr);
        System.out.println(res);
    }

    static int solution(int[] arr){
        int res=0;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];
        lMax[0]=arr[0];
        for(int i=1;i<arr.length;i++) lMax[i]=Math.max(arr[i], lMax[i-1]);
        rMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) rMax[i]=Math.max(arr[i], rMax[i+1]);
        for(int i=1;i<arr.length-1;i++) res+=(Math.min(lMax[i], rMax[i])-arr[i]);
        return res;
    }
}
