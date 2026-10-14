class Solution {
    public int firstUniqChar(String s) {
        if(s.length() ==1) return 0;
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for ( char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);

        }
        for(int i =0; i<=s.length()-1;i++){
            char c=s.charAt(i);
            if( hm.get(c)==1){
                return i;
            }
        }
            return -1;
    }
}