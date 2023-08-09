public class StringPalindrome {
    public static void main(String[] args) {
        String str="geeks";
        boolean result=isPalin(str);
        System.out.println(result);
    }

    static boolean isPalin(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
