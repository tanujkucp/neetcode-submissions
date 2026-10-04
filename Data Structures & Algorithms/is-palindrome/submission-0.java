class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int x = 0, e = s.length() - 1;

        while(x<=e){
            char a = s.charAt(x);
            if (!isValid(a)) {
                x++;
                continue;
            }
            char b = s.charAt(e);
            if (!isValid(b)) {
                e--;
                continue;
            }

            if(a != b){
                return false;
            } else {
                x++;
                e--;
            }
        }

        return true;
    }

    private boolean isValid(char a) {
        return (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9');
    }
}
