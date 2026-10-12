class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();

        for(char c : s1.toCharArray()){
            int count = map1.getOrDefault(c, 0);
            map1.put(c, count + 1);
        }
        
        int l = 0, r = s1.length();
        while(r <= s2.length()){
            boolean included = check(s2.substring(l, r), map1);
            if(included) return true;
            else {
                l++;
                r++;
            }
        }

        return false;

    }

    private boolean check(String s, Map<Character, Integer> map){
        Map<Character, Integer> copy = new HashMap<>(map);
        for(char c : s.toCharArray()){
            if(copy.getOrDefault(c,0) == 0){
                return false;
            } else {
                copy.put(c, copy.get(c) - 1);
            }
        }
        return true;
    }

}
