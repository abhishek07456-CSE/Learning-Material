package Data_Structure.Stack;

import java.util.Stack;

public class balanceBracketReversal {
    public static int countRev (String s)
    {
        Stack <Character> stack = new Stack <Character> ();
        int closing = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '{')
              stack.push('{');
            else{
                if(!stack.empty())
                stack.pop();
                else
                closing++;
            }
        }
        int opening = stack.size();
        if((opening+closing)%2!=0) return -1; // size of remaining opening bracket not even like }}{{} (last reaming other cancel out from each and other)
        return opening%2+closing%2 + opening/2 + closing/2;
        //}}{{ => reaming in stack that are not balance so here 2 reversal required {}{}
        // }}}{{{ => opening = 3 , closing =3 => {}}{{} (closing/2 + opening/2 )  one side need to change    => }{ (opening%2 + closing%2) remaining both side need to reverse for balancing
    }
    public static void main(String[] args) {
        System.out.println(countRev("{{}}"));
    }
}
