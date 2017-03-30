import java.util.ArrayList;
/**
 * Write a description of class Discard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Discard
{
    public static ArrayList<Card> discardStack;
    
    public static void addToPile(Card card)
    {
        discardStack.add(card);
    }
    
    
    public static void refill(Deck deck)
    {
        if (deck.isEmpty())
        {
            for (int a = 0; a < deck.getDeck().size(); a++)
            {
                deck.getDeck().add(discardStack.get(a));
            }
        }
    }
}
