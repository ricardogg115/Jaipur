import java.util.ArrayList;
/**
 * 
 * 
 * @author (Milly) 
 * @version (a version number or a date)
 */
public class Stack
{
    private ArrayList<Token> tokenStack;   
    
    /**
     * Constructor for class Stack
     * @param str String name to describe tokens in the Stack
     */
    public Stack(String str)
    {
        tokenStack = new ArrayList<Token>();
        for (int a = 0; a < 10; a++)
        {
            tokenStack.add(a,new Token(str,10-a));
        }
    }
        
    /**
     * Returns true or false if the Stack is empty or not.
     * 
     */
    public boolean isEmpty()
    {
        return tokenStack.isEmpty();
    }        
}
