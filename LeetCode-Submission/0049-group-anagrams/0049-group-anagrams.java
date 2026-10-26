class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String s : strs){
            char sorted[] = s.toCharArray();
            Arrays.sort(sorted);

            String key = new String(sorted);

            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);
             
        }
        return new ArrayList<>(hm.values());
    }
}