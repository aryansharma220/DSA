public class Largest_element_array {
    public static void main(String[] args) {
        int[] arr = {40,8,50,100};
        int res= largest(arr);
        System.out.println(res);
    }

    static int largest(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]<arr[j]) i=j;
        }
        return i+1;
    }
}
