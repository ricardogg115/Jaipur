
/**
 * Write a description of class Token here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Token
{
    private int tokenValue;
    private String goodType;
    /**
     * Constructor for objects of class Token
     * @param str type of Token
     * @param value number value assigned to it.
     */
    public Token(String str, int value)
    {
        goodType = str;
        tokenValue = value;
    }
    /**
     * Returns the value of the Token
     * @return tokenValue
     */
    public int getValue()
    {
        return tokenValue;
    }
    /**
     * Returns a String detailing the type of good on the Token
     * @return goodType
     */
    public String getType()
    {
        return goodType;
    }
}
