public class FrequencyCharacter{
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int arr[]= new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) System.out.println((char)(i+'a')+" "+arr[i]);
        }
    }

}