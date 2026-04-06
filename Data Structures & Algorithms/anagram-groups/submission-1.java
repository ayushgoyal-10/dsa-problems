class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        int n= strs.length;
        for(int i=0; i<n; i++){
            String s= strs[i];
            int count[]= new int[26];

            for(char ch: s.toCharArray()){
                count[ch-97]++;
            }
            String str= Arrays.toString(count);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
