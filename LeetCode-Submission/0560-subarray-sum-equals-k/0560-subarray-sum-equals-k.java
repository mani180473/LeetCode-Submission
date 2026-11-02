class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum =0,cnt =0;
        Map<Integer, Integer> hm = new HashMap<>();

        hm.put(0, 1);
        for(int n : nums){
            prefixSum += n;

            if(hm.containsKey(prefixSum - k)){
                cnt += hm.get(prefixSum - k);
            }
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0)+1);
        }
        return cnt;
    }
}