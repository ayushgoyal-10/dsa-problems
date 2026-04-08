class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> ans= new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int length= Integer.parseInt(s.substring(i, j));
            String word= s.substring(j+1, j+1+length);
            ans.add(word);

            i= j+1+length;
        }

        return ans;
    }
}
