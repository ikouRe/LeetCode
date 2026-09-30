class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        compose(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private void compose(String digits, int index, StringBuilder comb, List<String>res,Map<Character, String> digitToLetters)
    {
          if (index == digits.length()) {
            res.add(comb.toString());
            return;
          }
        String letters = digitToLetters.get(digits.charAt(index));

        for( char lettr : letters.toCharArray()){
            comb.append(lettr);
            compose(digits,index+1,comb,res,digitToLetters);
            comb.deleteCharAt(comb.length()-1);

        }
    }

    }
    

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna