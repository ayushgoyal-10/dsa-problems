class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq1[]= new int[26];
        int freq2[]= new int[26];

        for(int i=0; i<s.length(); i++){
            int idx= s.charAt(i)-97;
            freq1[idx]++;
        }
        
        for(int i=0; i<t.length(); i++){
            int idx= t.charAt(i)-97;
            freq2[idx]++;
        }

        for(int i=0; i<freq1.length; i++){
            if(freq1[i]!=freq2[i]) return false;
        }

        return true;
    }
}
