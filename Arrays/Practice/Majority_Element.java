public class Majority_Element {
    public static void main(String[] args) {
        int arr[]={3,7,4,7,7,3};
        int result=mooreAlgo(arr);
        System.out.println(result);
    }

    static int naive(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]) count++;
            }
            if(count>(arr.length/2)) return i;
        }
        return -1;
    }

//     // Boyer Moore's Majority Voting Algorithm --> Time Complexity O(n)
// Steps to implement the algorithm :
// Step 1 – Find a candidate with the majority –

// Initialize a variable say i ,votes = 0, candidate =-1 
// Traverse through the array using for loop
// If votes = 0, choose the candidate = arr[i] , make votes=1.
// else if the current element is the same as the candidate increment votes
// else decrement votes.
// Step 2 – Check if the candidate has more than N/2 votes –

// Initialize a variable count =0 and increment count if it is the same as the candidate.
// If the count is >N/2, return the candidate.
// else return -1.

    static int mooreAlgo(int arr[]){
        int res=0, count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]) count++;
            else count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]) count++;
        }
        if(count<=arr.length/2) res=-1;
        return res;
    }

}
