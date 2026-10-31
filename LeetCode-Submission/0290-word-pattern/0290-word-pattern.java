class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, Integer> hmp = new HashMap<>();
        Map<String, Integer> hms = new HashMap<>();

        String[]S = s.split(" ");
        int n = pattern.length();
        if(n != S.length) return false;
        for(int i =0; i< n; i++ ){
            char ch = pattern.charAt(i);

            if(!hmp.containsKey(ch))
                hmp.put(ch, i);

            String word = S[i];
            if(!hms.containsKey(word))    
                hms.put(word, i);

            if(!hmp.get(ch).equals(hms.get(word)))
                return false;    
        }
        return true;
    }
}