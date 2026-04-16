class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        
        int k= t.length();
        int n= s.length();
        int tFreq[]= new int[128];
        for(char ch: t.toCharArray()){
            tFreq[ch]++;
        }

        int window[]= new int[128];
        int required=0;
        for(int i=0; i<128; i++){
            if(tFreq[i] > 0) required++;
        }

        int minLen= Integer.MAX_VALUE;
        int left=0, right=0;
        int ansStart=0;
        int seq=0;
        while(right<s.length()){
            char ch= s.charAt(right);
            window[ch]++;

            if(tFreq[ch]>0 && window[ch]==tFreq[ch]){
                seq++;
            }

            // try to shrink when valid
            while(seq==required){
                // shrinking part, to minimize the window
                if(right-left+1 < minLen){
                    minLen= right-left+1;
                    ansStart= left;
                }

                char leftChar= s.charAt(left);
                window[leftChar]--;

                if(tFreq[leftChar] > 0 && window[leftChar]<tFreq[leftChar]){
                    seq--;
                }
                left++;
            }
            right++;
        }
        
        if(minLen==Integer.MAX_VALUE) return "";
        return s.substring(ansStart, ansStart+minLen);
    }
}