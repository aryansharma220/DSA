public class prac {
    public static void main(String[] args) {
        int arr[]={2,0,2};
        // frequencies(arr);
        int result = trappingRainWaterEff(arr);
        System.out.println(result);
    }

    static int trappingRainWaterNaive(int arr[]){
        int res=0;
        for(int i=1;i<arr.length-1;i++){
            int lmax=arr[i];
            for(int j=0;j<i;j++) lmax=Math.max(lmax,arr[j]);
            int rmax=arr[i];
            for(int j=i+1;j<arr.length;j++) rmax=Math.max(rmax,arr[j]);
            res=res+(Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }
    
    static int trappingRainWaterEff(int arr[]){
        int res=0;
        int n = arr.length;
        int lmax[]= new int[n];
        int rmax[]= new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++) lmax[i]=Math.max(lmax[i-1],arr[i]);
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) rmax[i]=Math.max(arr[i],rmax[i+1]);
        for(int i=0;i<n;i++) res=res+(Math.min(rmax[i],lmax[i])-arr[i]);
        return res;
    }

    static int stockBuySell(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) res+=arr[i]-arr[i-1];
        }
        return res;
    }

    static void frequencies(int arr[]){
        int frequency = 1;
        if(arr.length==1){
            System.out.println(arr[0]+" - "+frequency);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                System.out.println(arr[i-1]+" - "+frequency);
                frequency=0;
            }
            frequency++;
            if(i==arr.length-1) System.out.println(arr[i]+" - "+frequency);
        }
    }
    static int maxDiff(int arr[]){
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(res,arr[j]-minVal);
            minVal=Math.min(minVal,arr[j]);
        }
        return res;
    }

    static void leaderInArray(int arr[]){
        int leader=arr.length-1;
        System.out.print(arr[leader]+ " ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[leader]){
                leader=i;
                System.out.print(arr[leader]+" ");
            }
        }
    }
    static void reversalAlgo(int arr[],int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    static void leftRorateD(int arr[], int d){
        if(d>arr.length){
            d=d-arr.length;
        }
        int barr[]= new int[d];
        for(int i=0;i<d;i++){
            barr[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++){
            arr[i]=barr[j];
            j++;
        }
        for(int ele :arr){
            System.out.print(ele+ " ");
        }
    }

    static void leftRorateOne(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int ele :arr){
            System.out.print(ele+ " ");
        }
    }

    static void zeroToEnd(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[res];
                arr[res]=arr[i];
                arr[i]=temp;
                res++;
            }
        }
        // for(int i=res+1;i<arr.length;i++){
        //     arr[i]=0;
        // }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    static int removeDuplicate(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    static void revArr(int arr[]){
        int rarr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rarr[arr.length-1-i]=arr[i];
        }
        for(int ele :rarr){
            System.out.print(ele+" ");
        }
    }

    static void reverse(int arr[], int low, int high){
        // int low=0, high=arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }

    static void delArr(int arr[], int x){
        int res[]= new int[5];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) continue;
            res[j]=arr[i];
            j++;
        }
        for(int ele : res){
            System.out.println(ele);
        }
    }

    static int delArr2(int arr[], int x){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x) break;
        }
        if(i==arr.length-1) return arr.length;
        for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        return arr.length-1;
        // for(int ele : arr){
        //     System.out.println(ele);
        // }
    }

    static int indexLargest(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) max=i;
        }
        return max;
    }

    static int indexSecLargest(int arr[]){
        int max=indexLargest(arr);
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[max]){
                if(smax==-1) smax=i;
                else if(arr[i]>arr[smax]) smax=i;
            }
        }
        return smax;
    }

    static int indexSecondLargest(int arr[]){
        int res=-1, largest=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]) res=i;
            }
        }
        return res;
    }

    static int sLargest(int arr[]){
        int largest =0;
        int res=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(arr[i]>arr[res] || res==-1) res=i;
            }
        }
        return res;
    }

    static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
