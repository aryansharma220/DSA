import java.util.Scanner;

public class Operations_array {
    public static void main(String[] args) {
        int[] arr = {3,8,12,5,6};
        Scanner sc = new Scanner(System.in);
        int res = 
        delete(arr, 5, 12);
        System.out.println(res);
        sc.close();
    }

    // Searching for an element in array
    static void search(int[] arr, int ele){
        for(int i=0;i<4;i++){
            if(ele==arr[i]){
                System.out.println(i);
                break;
            }
        }
    }

    //Inserting in an array at a given position
    static int insert(int[]arr, int n, int pos, int cap, int x){
        if(n==cap) return n;
        int idx = pos-1;
        for(int i=n-1;i>=idx;i--) arr[i+1]=arr[i];
        arr[idx]=x;
        return n+1;
    }


    //Deleting a given element in array
    static int delete(int[] arr, int n, int ele){
        for(int i=0;i<n-1;i++){
            if(arr[i]==ele){
                arr[i]=arr[i=1];
            }
            // if(i==n-1) arr[i]=(Integer) null;
        
        }
        return n;
    }
}
