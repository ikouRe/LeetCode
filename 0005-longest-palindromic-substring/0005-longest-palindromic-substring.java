class Solution {
    public String longestPalindrome(String s) {
        String maxResult=s.substring(0,1);
        int maxLength=1;
        
        for (int i=0; i<s.length(); i++){
            for (int j=1; j<s.length();j++){
                if(j-i>maxLength && isPalindrome(s.substring(i,j))){
                    maxResult=s.substring(i,j);
                    maxLength=j-i;
                }
            }
        }
        return maxResult;
        
    }

    private Boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna