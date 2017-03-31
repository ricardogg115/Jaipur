import java.util.ArrayList;
/**
 * This class should and does call the cards from the card class and present it.
 * 
 * @author (Milly) 
 * @version (a version number or a date)
 */
public class Field
{
    public static ArrayList<Card> fieldCard;
    /**
     * Constructor for class Field populated with cards of a deck
     * object.
     * @param deck Deck object
     */
    public Field(Deck deck)
    {        
        fieldCard = new ArrayList<Card>();        
        for (int a = 0; a < 5; a++)
        {
            fieldCard.add(deck.drawCard());
        }
    }
    
    /**
     * Adds a specified card to the field.
     * @param card Card object
     */
    public static void addToField(Card card)
    {
        if (fieldCard.size() != 5)
        {
            fieldCard.add((card));
        }
    }
    
    /**
     * Returns and removes a card on the field at a specified spot 
     * on the field.
     * @param a Location on the field
     * @return Card object
     */
    public static Card getCard(int a)
    {
        return fieldCard.remove(a);
    }
    
    /**
     * Returns an ArrayList of Camels that are gathered up from the 
     * field.
     * @return camel
     */
    public static ArrayList<Camel> camelHerd()
    {
        ArrayList camel = new ArrayList();
        for (int a = 0; a < fieldCard.size(); a++)
        {
            if (fieldCard.get(a).getType().equals("Camel"))
            {
                camel.add(fieldCard.remove(a));
            }
        }        
        return camel;
    }
    
    /**
     * Returns the String version of the field.
     * @return field
     */
    public String toString()
    {        
        String field = " ";
        System.out.println("Field");
        for (Card card: fieldCard)
        {
            field += card.getType() + " ";
        }
        return field;
    }
     
}
