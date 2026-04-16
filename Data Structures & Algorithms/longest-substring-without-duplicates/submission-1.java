class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length(); 
        if(n==0 || n==1) return n;
        int []freq= new int[128];
        int left= 0, right= 0;

        int longest= 0;
        while(right<n){
            char ch= s.charAt(right);
            freq[ch]++;
            while(left<right && freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            longest= Math.max(longest, right-left+1);
            right++;
        }

        return longest;
    }
}
