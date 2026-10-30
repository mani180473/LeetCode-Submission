class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> hm = new LinkedHashMap<>();
        Map<Character, Integer> h = new LinkedHashMap<>();

        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch, i);
            }

            char ch2 = t.charAt(i);
            if(!h.containsKey(ch2)){
                h.put(ch2, i);
            }
            if(!hm.get(ch).equals(h.get(ch2)))
                return false;
        }
        
        return true;
    }
}