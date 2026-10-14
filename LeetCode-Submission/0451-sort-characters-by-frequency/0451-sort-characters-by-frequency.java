class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm =new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);

        }
        List<Character> ar =new ArrayList<>(hm.keySet());
        ar.sort((i,j)-> hm.get(j)-hm.get(i));
        StringBuilder sb = new StringBuilder();
        for(char c : ar){
            sb.append(String.valueOf(c).repeat(hm.get(c)));
        }

        return sb.toString();
    }
}