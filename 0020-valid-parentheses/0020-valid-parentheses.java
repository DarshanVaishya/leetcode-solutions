class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') 
                stack.push(c);
            else {
                char top = stack.peek();
                if(top == '(' && c == ')')
                    stack.pop();
                else if(top == '{' && c == '}')
                    stack.pop();
                else if(top == '[' && c == ']')
                    stack.pop();
                else return false;
            }
        }

        return stack.size() == 0;
    }
}