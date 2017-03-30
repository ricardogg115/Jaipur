import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private ArrayList<Camel> playerHerd;
    private ArrayList<Card> playerHand;
    private ArrayList<Token> playerStack;
    private int sealOfExcellence;

    /**
     * Constructor for objects of class Player
     */
    public Player(ArrayList<Card> playerHand, ArrayList<Token> playerStack, int seal)
    {
        this.playerHand = playerHand;
        this.playerStack = playerStack;
        sealOfExcellence = seal;
    }
    /**
     * Cards from the player's hand will exchange with those
     * on the field.
     * @param a exchanges the card at this specified spot on the field.
     */
    public void exchange(Field field, int a)
    {
        Card card = playerHand.get(a);
        Card card2 = field.getCard(a);
        if (playerHand.size() < 7)
        {
            playerHand.remove(a);
            playerHand.add(card2);
        }
        field.addToField(card);        
    }
    
    /**
     * Takes exactly one card from the Field but does not exceed the max 
     * number of cards in the player's hand (7). 
     * @param a Takes a Card and adds it to the player hand at the 
     * specified spot.
     */
    public void takeOne(Field field, int a)
    {
        if (playerHand.size() == 7)
        {
            return;
        }
        playerHand.add(field.getCard(a));        
    }
    
    /**
     * Takes all the Camel cards on the Field.
     * @param field the field object for which the camels are in.
     */
    public void takeCamels(Field field)
    {
        for (int a = 0; a < field.fieldCard.size(); a++)
        {
            if (field.getCard(a).getType().equals("Camel"))
            {
                playerHand.add(field.getCard(a));
            }
        }
        
    }
    
    /**
     * Sells a specified amount of cards to the market and recieves a
     * Bonus Token based on the card type and amount sold.
     * @param card card that is being sold.
     * @param amount number of card being sold to market.
     * @return returns a Bonus Token of the amount sold.
     */
    public BonusToken sellCard(Card card, int amount)
    {
        ArrayList<Card> sell = new ArrayList<Card>();
        BonusToken token = new BonusToken(amount);
        int value = (int) (Math.random() * 11);
        playerStack.add(token);
        for (int a = 0; a < playerHand.size(); a++)
        {
            if (card.getType() == playerHand.get(a).getType())
            {
                playerHand.remove(card);
            }
        }                
        playerStack.add((new Token(card.getType(),value)));
        return token;
    }
    
    /**
     * If the player has the bigger amount of points overall, then the
     * corresponding player wins a Seal of Excellence.
     * @param player1 First Player
     * @param player2 Second Player
     */
    public void winRound(Player player1, Player player2)
    {
        int value1 = 0;
        int value2 = 0;
        
        for (int a = 0; a < playerStack.size(); a++)
        {
            value1 = player1.playerStack.get(a).getValue();
            value2 = player2.playerStack.get(a).getValue();
        }
        if (value1 > value2)
        {
            player1.sealOfExcellence += 1;
        }
        else{
            player2.sealOfExcellence += 1;
        }
    }
    
    /**
     * Returns the player's hand.
     * @return playerHand
     */
    public ArrayList<Card> getHand()
    {
        return playerHand;
    }
    
    /**
     * Returns the player's stack.
     * @return playerStack
     */
    public ArrayList<Token> getStack()
    {
        return playerStack;
    }
    
    /**
     * Returns the player's number of seals.
     * @return sealOfExcellence
     */
    public int getSeals()
    {
        return sealOfExcellence;
    }
    
    /**
     * Returns the player's herd.
     * @return playerHerd
     */
    public ArrayList<Camel> getHerd()
    {
        return playerHerd;
    }
}
