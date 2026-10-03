class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            if(str.isEmpty()){
                str = "<E>";
            }
            sb.append(str).append("#@#");
        }
        return sb.substring(0, sb.length() -3).toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if(str.isEmpty()) return res;
        String[] arr = str.split("#@#");
        
        for(String e : arr){
            if(e.equals("<E>")){
                e = "";
            }
            res.add(e);
        }
        return res;
    }
}
