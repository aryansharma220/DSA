public class Frequency_sortedArray {
    public static void main(String[] args) {
        int[] arr = {40,50,50,50};
        method(arr);
    }

    static void method(int[] arr){
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                System.out.println(arr[i-1]+" "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+" "+count);
    }
}
