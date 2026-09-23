class Solution {
    public int reverse(int x) {
        int mod =0;
        int res=0;
        while(x!=0){
         mod= x % 10;
         x= x/10;
         res=(mod *10)+(res*10);
}
    return res/10;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna