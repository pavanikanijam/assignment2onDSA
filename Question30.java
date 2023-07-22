class Solution {
    public String longestCommonPrefix(String[] str1) {
        Arrays.sort(str1);
        String str2 = str1[0];
        String str3 = str1[str1.length-1];
        for(int i=0;i<Math.min(str2.length(), str3.length()); i++){
            if(str2.charAt(i)!=str3.charAt(i)){
                return str2.substring(0,i);
            }
        }
        return str2;
    }
}
