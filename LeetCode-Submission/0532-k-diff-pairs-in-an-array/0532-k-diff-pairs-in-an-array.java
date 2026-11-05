class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int n : nums)
            hm.put(n, hm.getOrDefault(n, 0)+1);

        int cnt = 0;
        for(Map.Entry<Integer, Integer> e :  hm.entrySet()){
            if(k == 0){
                if(e.getValue() >= 2){
                    cnt++;
                }
            }else{
                if(hm.containsKey(e.getKey() + k)){
                    cnt++;
                }
                
            }
        }    
        return cnt;
    }
}