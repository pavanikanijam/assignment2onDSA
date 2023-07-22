class Solution {
    public String longestPalindrome(String str) {

        int first =0,last=0;
        for(int i=0;i<str.length();i++){
            
            int length1= extendPel(str,i,i);
            int length2=extendPel(str,i,i+1);
            int length =Math.max(length1,length2);
            if(length>(last-first)+1){   
                first=i-(length-1)/2;
                last=i+length/2;
            }
        }
        return str.substring(first,last+1);
    }
    int extendPel(String str1,int a,int b){
        while(a>=0 && b<str1.length() && str1.charAt(a)==str1.charAt(b)){
            a--;
            b++;
        }
        return b-a-1;  
    }
}
