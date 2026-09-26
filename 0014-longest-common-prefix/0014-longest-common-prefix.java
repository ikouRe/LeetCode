class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonString=strs[0];
        for (int i=1;i < strs.length;i++){
            int j=0;
           while (j < strs[i].length() && j < commonString.length()
                    && strs[i].charAt(j) == commonString.charAt(j)) {
                j++;
            }
            commonString=strs[i].substring(0,j);
            if (commonString.isEmpty()) return "";

        }
        return commonString;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna