class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        int ans= 0;
        Set<Integer> set= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        
        for(int num: set){
            if(!set.contains(num-1)){
                int val= num;
                int count=1;
                while(set.contains(val+1)){
                    count++;
                    val++;
                }
                ans= Math.max(ans, count);
            }
        
        }

        return ans;
    }
}
