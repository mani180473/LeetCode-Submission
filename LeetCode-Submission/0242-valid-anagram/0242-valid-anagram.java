class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            hm.computeIfPresent(c, (key,val) -> val > 1 ? val-1 : null);
        }
        return hm.isEmpty();
    }
}