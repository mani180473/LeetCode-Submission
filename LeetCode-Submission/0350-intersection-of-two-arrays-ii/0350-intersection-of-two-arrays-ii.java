class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums1){
            hm.put(n, hm.getOrDefault(n,0)+1);

        }
    
        List<Integer> res = new ArrayList<>();
        for(int n : nums2){
            if(hm.containsKey(n) && hm.get(n)>0){
               res.add(n);
               hm.put(n, hm.get(n)-1);
               
            }
        }
        int ans[] = new int[res.size()];
        for(int i =0; i< res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}