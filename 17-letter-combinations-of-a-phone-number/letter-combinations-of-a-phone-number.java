class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, mapping, new StringBuilder(), ans);

        return ans;
    }

    private void backtrack(int index,
                           String digits,
                           String[] mapping,
                           StringBuilder current,
                           List<String> ans) {

        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {

            current.append(ch);  // choose

            backtrack(index + 1, digits, mapping, current, ans);

            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}