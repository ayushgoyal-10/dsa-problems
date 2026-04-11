class Solution {
    public boolean isPalindrome(String s) {
        String str= helper(s.toLowerCase());
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    private String helper(String s){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
