class Solution {
    class Pair implements Comparable<Pair>{
        int val; 
        int freq;
        public Pair(int val, int freq){
            this.val= val;
            this.freq= freq;
        }

        public int compareTo(Pair p){
            return p.freq-this.freq;
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]= new int[k];
        Map<Integer, Integer> map= new HashMap<>();
        PriorityQueue<Pair> q= new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val= entry.getKey();
            int freq= entry.getValue();
            q.offer(new Pair(val, freq));
        }

        for(int i=0; i<k; i++){
            ans[i]= q.poll().val;
        }

        return ans;
    }
}