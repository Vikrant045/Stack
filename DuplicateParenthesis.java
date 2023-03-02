import java.util.*;

public class DuplicateParenthesis {
    public static boolean duplicateParenthesis(String st) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == ')') { // CLOSING PARENTHESIS
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;

                }
                if (count < 1) {
                    return true; // duplicate found
                } else {
                    s.pop();
                }
            } 
            
            else { // OPENING PARENTHESIS
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String st = "((a+b))+(a-b)";

        System.out.println(duplicateParenthesis(st));
    }

}
