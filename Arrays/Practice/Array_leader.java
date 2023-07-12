public class Array_leader {
    public static void main(String[] args) {
        int[] arr={7,10,4,6,5,2};
        betterLeader(arr);
    }

    static void naiveLeader(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false)
            System.out.println(arr[i]);
        }
    }

    static void betterLeader(int[] arr){
        int leader = arr[arr.length-1];
        System.out.println(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.println(leader);
            }
        }
    }
}
