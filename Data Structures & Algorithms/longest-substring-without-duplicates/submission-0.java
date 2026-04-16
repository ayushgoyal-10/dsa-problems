class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        if(n==0 || n==1) return n;
        Set<Character> set= new HashSet<>();
        int longest=0;
        int start=0, end= 0;
        while(end<n){
            char ch= s.charAt(end);

            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(ch);
            longest= Math.max(longest, end-start+1);
            end++;
        }
        
        return longest;
    }
}
