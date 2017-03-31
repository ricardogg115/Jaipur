import java.util.ArrayList;
/**
 * The Discard class recieves/takes cards and makes a discard stack in which it places
 * the discarded cards, yet does not completely eliminate/destroy them. 
 * It also refills the deck once it (the deck) becomes empty using a static void refill method.  
 * 
 * @author (Diana Olmos) 
 * @version (version 1)
 */
public class Discard
{
    public static ArrayList<Card> discardStack;
    // @param 
    public static void addToPile(Card idk)
    {
        discardStack.add(idk);
    }
    
    
    public static void refill(Deck trash)
    {
        if (trash.isEmpty())
        {
            for (int i = 0; i < trash.getDeck().size(); i++)
            {
                trash.getDeck().add(discardStack.get(i));
            }
        }
    }
}
