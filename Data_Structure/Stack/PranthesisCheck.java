package Data_Structure.Stack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class PranthesisCheck {
    private static Map <Character,Character> m;
    static {
        m = new LinkedHashMap <Character,Character>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
    }
    static boolean ispar(String x)
    {
        int l = x.length();
        Stack <Character> s = new Stack <Character> ();

        for(int i = 0 ; i < l ; i++){
            if(m.get(x.charAt(i))==null){
                s.push(x.charAt(i));
            }else{
                if(!s.empty() && s.peek() == m.get(x.charAt(i)))
                 s.pop();
                else
                 return false;
            }

        }
        return s.empty();
    }
    public static void main(String[] args) {
       System.out.println(ispar("()"));
       System.out.println(ispar("([()])"));
       System.out.println(ispar("}["));

    }
}
