class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map= new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s= strs[i];
            char charArray[]= s.toCharArray();
            Arrays.sort(charArray);
            String sortedS= new String(charArray);
            if(!map.containsKey(sortedS)){
                map.put(sortedS, new ArrayList<>());
            }
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
