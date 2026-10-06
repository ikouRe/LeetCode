class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> pile = new Stack<>();
        int res=0;
        for (int i =0;i<s.length();i ++){
            if(s.charAt(i)=='('){
                pile.push('(');

            }else{
                if(pile.isEmpty()){
                    res++;
                }
                else{
                    pile.pop();
                }
               
            }

        }
        if(pile.isEmpty()){
            return res;
        }
        return res+ pile.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna