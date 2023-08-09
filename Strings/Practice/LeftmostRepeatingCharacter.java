public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int result=naive(str);
        System.out.println(result);
    }

    static int naive(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) return i;
            }
        }
        return -1;
    }
}
