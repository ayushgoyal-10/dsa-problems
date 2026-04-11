class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1 ||nums.length==0) return nums.length; 
        Map<Integer, Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ans= 1;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val= entry.getKey();
            if(!map.containsKey(val-1)){
                int count=1;
                int curr= val;
                while(map.containsKey(curr+1)){
                    count++;
                    curr++;
                    ans= Math.max(ans, count);
                }
            }
        }

        return ans;
    }
}
