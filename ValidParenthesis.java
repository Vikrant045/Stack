import java.util.*; 
public class ValidParenthesis{

    public static boolean validParenthesis(String st){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch =st.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){ // OPENING PARENTHESIS
            s.push(ch);
            }
            else{    // CLOSING PARENTHESIS
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='{'&& ch=='}') || (s.peek()=='['&& ch==']')||(s.peek()=='('&& ch==')')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        String st = "{]";

      System.out.println(validParenthesis(st));  
    }
}