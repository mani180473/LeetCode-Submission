class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        int n = nums.length/2;
        int ans = 0;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() > n){
                ans = e.getKey();
            }
        }
        return ans;
    }
}