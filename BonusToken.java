
/**
 * The BonusToken Class is used to trade cards with tokens
 * 
 * @author (Horus Hernandez) 
 * @version (1.0)
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
