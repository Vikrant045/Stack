import java.util.*;

public class ReverseOfString {

    public static String reverseString( String st){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            s.push(ch);
        }
        StringBuilder result = new StringBuilder();

        while(!s.isEmpty()){
            char c = s.pop();

            result.append(c);
        }
        return result.toString();
 

    }

    public static void main(String args[]){

String st = "RACECAR";
System.out.println(st);
System.out.println( reverseString( st)); 


    }
    
}
