import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int arr[]={1,5,34,2,6,21};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        char arr2[]={'A','Z','T','D'};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Integer arr3[]={1,4,4,24,57,4,12,2};
        Arrays.sort(arr3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));
    }

}
