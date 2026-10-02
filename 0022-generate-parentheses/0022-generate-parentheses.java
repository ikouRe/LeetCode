class Solution {
    List <String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
            if (n-- ==1){
                return List.of("()");
            }
            compose(n,n,"(");
           
            return res;

        }
         private void compose(int i, int j, String s){
            if(i ==0 && j ==0){
                res.add(s + ")");
                return;
            }

            if( i > 0){
                compose(i-1,j, s + "(");

            }

            if (j >= i)
            {compose(i, j-1, s+ ")");}
        }
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna