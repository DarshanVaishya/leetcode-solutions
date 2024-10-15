class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", n, 0, 0);
        return res;
    }


    private void backtrack(List<String> res, String s, int n, int openN, int closedN) {
        if(openN == n && closedN == n) {
            res.add(s);
            return;
        }

        if(openN < n) {
            backtrack(res, s + "(", n, openN + 1, closedN);
        }
        
        if(closedN < openN) {
            backtrack(res, s + ")", n, openN, closedN + 1);
        }
    }
}