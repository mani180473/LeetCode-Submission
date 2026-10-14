class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm =new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,0)+1);

        }
        List<Integer> li =new ArrayList<>(hm.keySet());
        li.sort((i,j)-> {
            if(hm.get(i).equals(hm.get(j)))
                return j-i;
                
                return hm.get(i)-hm.get(j);
        });

        int[] ans =new int[nums.length];
        int idx =0;
        for(int n : li){
            for(int k =0; k<hm.get(n); k++){
                ans[idx++] =n;
            }
        }
        return ans;
    }
}