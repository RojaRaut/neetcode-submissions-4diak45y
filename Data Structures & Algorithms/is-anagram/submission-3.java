class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> anagramCheck = new HashMap<>();
        for(char ch : s.toCharArray()) {
            anagramCheck.put(ch, anagramCheck.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            if(!anagramCheck.containsKey(ch)) {
                return false;
            } 
                anagramCheck.put(ch, anagramCheck.get(ch) - 1);
                if(anagramCheck.get(ch) == 0){
                    anagramCheck.remove(ch);
                }
        
        }
        return anagramCheck.isEmpty();
    }
}
