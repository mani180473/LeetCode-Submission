class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }
        for(int f : hm.values()){
            if(f > 1)
                return true;
        }
        return false;
    }
}