import java.util.ArrayList;

public class Stack
{
    public ArrayList<Token> tokenStack;   
    public Stack(String str)
    {
        for (int Gold = 0; Gold <= 10; Gold++)
        {
            tokenStack.add(Gold,new Token(str,10-Gold));
        }        
    }
    public boolean isEmpty()
    {
        return tokenStack.isEmpty();
    }
}
