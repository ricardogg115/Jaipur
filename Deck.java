import java.util.ArrayList;
import java.util.Collections;
/**
 *This class gets all the total of all the diffrent good cards and puts the total amount of the cards.
 * 
 * @author (Milly) 
 * @version (a version number or a date)
 */
public class Deck
{
    private ArrayList<Card> goodsCard;
    
    /**
     * Constructor for class Deck
     */
    public Deck()
    {        
        goodsCard = new ArrayList<Card>();
        ArrayList<Card> diamond = new ArrayList<Card>();
        ArrayList<Card> gold = new ArrayList<Card>();
        ArrayList<Card> silver = new ArrayList<Card>();
        ArrayList<Card> spice = new ArrayList<Card>();
        ArrayList<Card> silk = new ArrayList<Card>();
        ArrayList<Card> leather = new ArrayList<Card>();
        ArrayList<Camel> camel = new ArrayList<Camel>();
        for (int a = 0; a <= 10; a++)
        {
            diamond.add(a,(new Card("Diamond")));
            goodsCard.add(diamond.get(a));
        }
        for (int b = 0; b <= 10; b++)
        {
            gold.add(b,(new Card("Gold")));
            goodsCard.add(gold.get(b));
        }
        for (int c = 0; c <= 10; c++)
        {
            silver.add(c,(new Card("Silver")));
            goodsCard.add(silver.get(c));
        }
        for (int d = 0; d <= 10; d++)
        {
            spice.add(d,(new Card("Spice")));
            goodsCard.add(spice.get(d));
        }
        for (int e = 0; e <= 10; e++)
        {
            silk.add(e,(new Card("Silk")));
            goodsCard.add(silk.get(e));
        }
        for (int f = 0; f <= 10; f++)
        {
            leather.add(f,(new Card("Leather")));
            goodsCard.add(leather.get(f));
        }       
        for (int g = 0; g <= 10; g++)
        {
            camel.add(g,(new Camel("Camel")));
            goodsCard.add(camel.get(g));
        }
        Collections.shuffle(goodsCard);
    }
    
    /**
     * Returns true if the deck's ArrayList is empty. False 
     * otherwise.
     * @return true if empty or false
     */
    public boolean isEmpty()
    {
        return goodsCard.isEmpty();
    }
    
    /**
     * Returns a Card object that has been drawn/removed from the "top"
     * of the deck.
     * @return Card
     */
    public Card drawCard()
    {
        return goodsCard.remove(0);
    }
    
    /**
     * Returns the entire deck.
     * @return goodsCard
     */
    public ArrayList<Card> getDeck()
    {
        return goodsCard;
    }
              
}
