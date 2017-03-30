import java.util.ArrayList;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private String goodType;
    /**
     * Constructor for objects of class Card
     * @param str card type
     */
    public Card(String str)
    {
        goodType = str;
    }
    
    /**
     * Returns the type of Card.
     * @return goodType
     */
    public String getType()
    {
        return goodType;
    }
}
