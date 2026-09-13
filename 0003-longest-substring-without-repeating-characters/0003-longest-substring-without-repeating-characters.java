class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=1;
        if (s.isEmpty()){return 0;}
        for (int i=0; i< s.length() ;i ++){
            for (int j=i+1;j<=s.length(); j++){
                if((j-i>=maxLength) && (notRepeated(s.substring(i,j)))){
                    maxLength=j-i;
                }
            }
    

        }
        return maxLength;
    }
    Boolean notRepeated(String str){
        for (int i =0; i<str.length()-1; i++){
            String rest=str.substring(i+1);
            if (rest.indexOf(str.charAt(i))!=-1){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna