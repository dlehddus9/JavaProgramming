package HomeWork3;

import java.util.*;

public class PostFix {
    public static void main(String[] args) {
        new PostFix();
    }
    private String expression = " 3.0 + 2.0 * 1.5 - ( 3.5 + 1.5 ) - 2.0 ";
    public PostFix(){

        System.out.println(infixToPostFix(expression));
    }
    private int priority(char c)
    {
        switch (c)
        {
            case '*':
            case '/' :
                return 2;
            case '-':
            case '+':
                return 1;
                default:
                    return 0;
        }
    }
    private boolean isOperator(char c){
        switch (c)
        {
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
                return true;
            default:
                return false;
        }
    }
    private String infixToPostFix(String expression)
    {
        Stack<Character> oper = new Stack<>();
        String postFix= " ";
        StringTokenizer st = new StringTokenizer(expression);

        while (st.hasMoreTokens()) {
            String s= st.nextToken();
            char c= s.charAt(0);
            if(!isOperator(c) && c != '(' && c !=')' )
            {
                postFix += (s + " ");
            }
            else if(c == '(')
            {
                oper.push(c);
            }
            else if(isOperator(c)){

                boolean repeat = true;
                while(repeat)
                {
                    repeat = false;
                    if(oper.isEmpty() || oper.peek() == '(' || priority(c) > priority(oper.peek()))
                    {
                        oper.push(c);
                    }else {
                        postFix +=(oper.pop() + " ");
                        repeat = true;
                    }
                }
            } else if(c== ')')
            {
                if(isOperator(oper.peek()))
                {
                    postFix +=(oper.pop() + " ");
                } else if(oper.peek()== '(')
                {
                    oper.pop();
                }
            }
        }
        while (!oper.empty()) {
            if(isOperator(oper.peek())) {
                postFix +=(oper.pop() + " ");

            }
            else if(oper.peek() == '(')
                oper.pop();
        }
        return postFix;
    }
}
