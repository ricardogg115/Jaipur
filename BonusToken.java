
/**
 * Write a description of class BonusToken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusToken extends Token
{
    // instance variables - replace the example below with your own
    private int bonusToken;

    /**
     * Constructor for objects of class BonusToken
     */
    public BonusToken(int a)
    {
        super("",a);
    }
    
    /** 
     * Returns token value.
     * @return bonusToken
     */
    public int getTokenValue()
    {
        return bonusToken;
    }
}
