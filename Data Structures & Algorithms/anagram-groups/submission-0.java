class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> grouped = Arrays.asList(strs)
            .stream()
            .collect(Collectors.groupingBy(
                s -> createKey(s)
            ));
        return new ArrayList<>(grouped.values());
    }

    private String createKey(String s){
        int[] key = new int[26];
        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            key[index] += 1;
        }
        return Arrays.toString(key);
    }

}
