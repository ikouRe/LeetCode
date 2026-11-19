class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c =='('|| c=='[' ||c=='{' ){
                stack.push(s.charAt(i));
            }else{
                if (stack.isEmpty()) return false;
                switch (c ){
                    case ')': if (stack.pop() != '(') return false; break;
                    case ']': if (stack.pop() != '[') return false; break;
                    case '}': if (stack.pop() != '{') return false; break;
                }
            }
        }
        return stack.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna