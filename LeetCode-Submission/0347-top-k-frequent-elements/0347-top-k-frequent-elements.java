class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int a : nums)
            map.put(a, map.getOrDefault(a,0)+1);
        List<Integer> ar=new ArrayList<>(map.keySet());
        
        ar.sort((i,j) -> map.get(j)-map.get(i));
        
        int ans[]=new int[k];
        for(int i=0; i<k;i ++){
            ans[i]=ar.get(i);
        }

        return ans;

    }
}