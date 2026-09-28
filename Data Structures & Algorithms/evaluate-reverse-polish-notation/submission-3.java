class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("*") || token.equals("+")
            || token.equals("-") || token.equals("/")) {
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int c;
                if (token.equals("*")) c = a * b;
                else if (token.equals("+")) c = a + b;
                else if (token.equals("-")) c = a - b;
                else c = a / b;

                stack.push(c);
            }
            else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
