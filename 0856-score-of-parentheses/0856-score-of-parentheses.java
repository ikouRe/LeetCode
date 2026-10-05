class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> p =new Stack<> ();
        int res=0;
        int mul=1;
        for (int i=0 ;i<s.length();i++){
            if(s.charAt(i)=='('){
                p.push(i);
            }
            else{
                p.pop();
                if(s.charAt(i-1)=='('){
                res += (int) Math.pow(2, p.size());
                }
                
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna