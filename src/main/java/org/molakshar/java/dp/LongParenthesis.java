package org.molakshar.java.dp;


import java.util.Stack;

/// https://leetcode.com/KarunAhluwalia/

// Idea here is to keep reading the string and if the char at 'i'
// index is '(' then push the index to stack, else if it is ')' then pop
// As soon as we get ')' and stack still has some index of '(' on top,
// it means until now we have gathered a valid paranthesis from 'i' until
// index on top of stack so find the maxLen.

// SC: O(N) -> In worst case stack can contain indexes upto N (lentth of S)
// TC: O(N) -> read through complete string

public class LongParenthesis {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>(); // stores index of '(' or index of ')' if stack is empty
        int maxLen = 0;
        stack.push(-1); // initiate stack with ')' ? why this is the index for closing parenthesis
        // (for the base case when there is no '(' index left and we need to pop)
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                System.out.println("pushing " + i);
                stack.push(i);
            } else {
                System.out.println("popped " + stack.pop());
                if (stack.isEmpty()) {
                    stack.push(i); // every time atleast one index of topmost ')'
                    // will be there in the stack (to start with it will be -1 (see above))
                } else {
                    System.out.println("maxLen " + maxLen);
                    System.out.println("i " + i);
                    maxLen = Math.max(maxLen, i - stack.peek());
                    System.out.println("new maxLen " + maxLen);
                    System.out.println("stack.peek() " + stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String args[]) {
        LongParenthesis longParenthesis = new LongParenthesis();
        //System.out.println(longParenthesis.longestValidParentheses(""));
        System.out.println(longParenthesis.longestValidParentheses("("));
        //System.out.println(longParenthesis.longestValidParentheses(")"));
        //System.out.println(longParenthesis.longestValidParentheses("()"));
        //System.out.println(longParenthesis.longestValidParentheses("())"));
        //System.out.println(longParenthesis.longestValidParentheses(")())("));
        //System.out.println(longParenthesis.longestValidParentheses("()()"));
        //System.out.println(longParenthesis.longestValidParentheses("()()()("));
        //System.out.println(longParenthesis.longestValidParentheses("()()()())"));
        //System.out.println(longParenthesis.longestValidParentheses("()()()()"));
        //System.out.println(longParenthesis.longestValidParentheses("()()()()("));
        //System.out.println(longParenthesis.longestValidParentheses("((()))("));
        //System.out.println(longParenthesis.longestValidParentheses("((()))()("));



    }
}
