public class MultidimentionArrayIntro {
    public static void main(String[] args) {
        // int n=3, m=2;
        // int arr[][]=new int[m][n];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=10;
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        jaggedArrays();
        int arr[][]={{1,2,3},{4,5,6}};
        print(arr);
    }

    // An array is called Jagged Array if all its rows are not of same size
    static void jaggedArrays(){
        int m=3;
        int arr[][]=new int[m][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
