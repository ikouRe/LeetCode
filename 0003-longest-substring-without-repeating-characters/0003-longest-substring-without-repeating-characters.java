class Solution {
    public int lengthOfLongestSubstring(String s) {
     int[] lastSeen = new int[128];
     int maxLength=0;
     java.util.Arrays.fill(lastSeen, -1);
     int start =0;
     for (int end =0; end < s.length();end++){
        char c = s.charAt(end);
        if (lastSeen[c]>=start){
            start=lastSeen[c]+1;
        }
        lastSeen[c]= end;
        maxLength = Math.max(maxLength, end - start + 1);

     }
     return maxLength;
}}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna