
public class Token
{
    private int tokenValue;
    private String goodType;
    
    /**
    * Constructor for objects of class Token
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
