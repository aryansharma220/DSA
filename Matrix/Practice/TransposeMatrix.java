public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        printTranspose(arr);
    }

    static void printTranspose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // arr[j][i]=arr[i][j];
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
