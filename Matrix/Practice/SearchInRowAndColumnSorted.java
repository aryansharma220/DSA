public class SearchInRowAndColumnSorted {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 41 } };
        efficient(arr, 29);
    }

    static void naive(int arr[][], int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == x) {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
        System.out.println(" Not Found");
    }

    static void efficient(int arr[][], int x) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == x) {
                System.out.print(i + "," + j);
                return;
            } else if (arr[i][j] > x)
                j--;
            else
                i++;
        }
        System.out.println("Not Found");
    }
}
