class Solution {
    public boolean isNumber(String str) {
                str = str.trim();
        
        boolean number = false;
        boolean point = false;
        boolean e = false;
        boolean number_After = true;
        
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            
            if (Character.isDigit(c1)) {
                number = true;
                number_After = true;
            } else if (c1 == '.') {
                if (point || e)
                    return false;
                point = true;
            } else if (c1 == 'e' || c1 == 'E') {
                if (e || !number)
                    return false;
                e = true;
                number_After = false;
            } else if (c1 == '+' || c1 == '-') {
                if (i != 0 && str.charAt(i-1) != 'e' && str.charAt(i-1) != 'E')
                    return false;
            } else {
                return false;
            }
        }
        
        return number && number_After;
    }
}
