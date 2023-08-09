public class SubsequenceString {
    public static void main(String[] args) {
        String str1="ABCDE";
        String str2="AED";
        boolean result=isSubsequence(str1, str2);
        System.out.println(result);
    }

    static boolean isSubsequence(String str1, String str2){
        int s=0;
        for(int i=0;i<str1.length();i++){
            if(str2.charAt(s)==str1.charAt(i)) s++;
            if(s==str2.length()) return true;
        }
        return false;
    }
}
