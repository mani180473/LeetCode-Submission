class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
       //frstUniqueElement
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == 1 && (e.getKey() & 1) == 0) {
                return e.getKey();
                
            }
        }

        return -1;
    }
}