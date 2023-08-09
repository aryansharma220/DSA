import java.util.Arrays;

public class Anangram {
    public static void main(String[] args) {
        String str1="aaacb";
        String str2="cabaa";
        boolean result=isAnagram(str1, str2);
        System.out.println(result);
    }

    static boolean isAnagram(String str1, String str2){
        int arr1[]= new int[26];
        for(int i=0;i<str1.length();i++){
            arr1[str1.charAt(i)-'a']++;
        }
        String res1=Arrays.toString(arr1);
        // for(int i=0;i<arr.length;i++){
            //     if(arr[i]>0) System.out.println((char)(i+'a')+" "+arr[i]);
            // }
        int arr2[]= new int[26];
        for(int i=0;i<str2.length();i++){
            arr2[str1.charAt(i)-'a']++;
        }
        String res2=Arrays.toString(arr2);
        return (res2.equals(res1));
    }
}
