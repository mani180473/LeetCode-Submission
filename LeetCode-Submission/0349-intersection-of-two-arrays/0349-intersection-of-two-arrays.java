class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums1){
            set.add(n);
        }
        Set<Integer> intersect = new HashSet<>();

        for(int n : nums2){
            if(set.contains(n)){
                intersect.add(n);
            }
        }

        int[] ans = new int[intersect.size()];
        int i =0;
        for(Integer n : intersect){
            ans[i] = n;
            i++;
        }
        return ans;
    }
}