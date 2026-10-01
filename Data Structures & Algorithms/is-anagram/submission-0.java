class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t == null) return false;
        if(s.length() != t.length()) return false;

        Map<Character, Integer> counts = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            Character c = t.charAt(i);
            if(counts.containsKey(c)){
                counts.put(c, counts.get(c) - 1);
            } else {
                return false;
            }
        }

        for(Integer c : counts.values()){
            if (c != 0) return false;
        }

        return true;

    }
}
