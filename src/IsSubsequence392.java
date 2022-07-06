public class IsSubsequence392 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        System.out.println(isSubsequence(str1, str2));
    }
    public static boolean isSubsequence(String s, String t){
        if(s.equals("")){
            return true;
        }
        int index =0;
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == s.charAt(index)){
                index++;
            }
            if(index >= s.length()){
                return true;
            }
        }
        return false;
    }
}
