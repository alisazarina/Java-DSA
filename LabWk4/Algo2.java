import java.util.*;

/**
 * @author ALISA ZARINA
 * 
 * Instructions:
 * Create a Java program to [convert postfix -> infix].
 * 1. [Scanner input] -- Ask the user to input a postfix expression.
 * 2. [Logic here] -- Provide the code to evaluate that postfix expression.
 * i) If operand, push onto stack. (if not full)
 * ii) If operator,
 *    + pop 2 elements from the stack (error if stack contains < 2 operators)
 *    + add last element with operator
 *    + concatenate it with first element
 *    + push result back to stack (for future evaluation)
 * 3. [Output/Print] -- Display the evaluation value at the end.
 * 
 * / Submit to VLE on 26/10. /
 */

 public class Algo2 {

    static boolean isOperator(char a) {
        if (a == '+' || a == '-' || a == '*' || a == '/' || a == '%') 
        return true;

        return false;
    }

    static Integer evaluatePostfix(String exp) {

        // Create empty stack.
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            // Perform operations.
            if (isOperator(exp.charAt(i))) {
                int x = stack.pop();
                int y = stack.pop();
                int total = 0;

                switch(exp.charAt(i)) {
                    case '+':
                    total = y + x;
                    stack.push(total);
                    break;

                    case '-':
                    total = y - x;
                    stack.push(total);
                    break;

                    case '*':
                    total = y * x;
                    stack.push(total);
                    break;

                    case '/':
                    total = y / x;
                    stack.push(total);
                    break;

                    case '%':
                    total = x % y;
                    stack.push(total);
                    break;
                }
            } else {
                // Convert to integer.
                int operand = exp.charAt(i) - '0';
                stack.push(operand);
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for input +  Read postfix expression from user.
        System.out.println("Hello. Let's evaluate a postfix expression!");     
        System.out.println("\nPlease input a postfix expression:");

        String exp = sc.nextLine();

        System.out.println("\nThe evaluated value is: ");
        System.out.println(evaluatePostfix(exp));


    }
 }
