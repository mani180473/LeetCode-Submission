class Solution {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0, maxLen = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i =0; i<nums.length; i++){

            if(nums[i] == 0){
                prefixSum -=1;
            }else{
                prefixSum +=1;
            }

            if(hm.containsKey(prefixSum)){

                maxLen = Math.max(maxLen, i - hm.get(prefixSum));

            }else{
                hm.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}