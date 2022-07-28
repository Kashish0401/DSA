package Stack;

import java.util.*;
public class k {
    boolean isOpening(char c) {
        return c=='{'||c=='['||c=='(';
    }
    boolean isClosing(char a,char b) {
        return ((a=='('&&b==')')|| (a=='{'&&b=='}')||(a=='['&&b==']'));
    }
    boolean isMatch(String str) {
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(isOpening(ch)) {
                s.push(ch);
            }
            else {
                if(s.isEmpty())
                {
                    return false;
                }
                else if(!isClosing(s.peek(), ch))
                {
                    return false;
                }
                else
                {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String args[])
    {
        k obj=new k();
        String str="{{{{((()))}}}";
        boolean result=obj.isMatch(str);
        System.out.println(result);
    }
}