class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);

        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 1; i<= n; i++ ){
            if(!set.contains(i)){
                ar.add(i);
            }
        }    
        return ar;
    }
}