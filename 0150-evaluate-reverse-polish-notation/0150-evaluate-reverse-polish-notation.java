class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int res = 0;

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                System.out.println(a + " " + token + " " + b);
                if(token.equals("+"))
                        res = a + b;
                else if(token.equals("-"))
                        res = a - b;
                else if(token.equals("*"))
                        res = a * b;
                else if(token.equals("/"))
                        res = a / b;
                System.out.println(res);
                stack.push(String.valueOf(res));
            } else {
                stack.push(token);
            }
        }

        if(stack.size() == 1 && res == 0) res = Integer.parseInt(stack.pop());

        return res;
    }
}