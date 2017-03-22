import java.util.ArrayList;




public class Player
{
    public ArrayList<Card> playerHand;
    public ArrayList<Token> playerStack;
    public int sealOfExcellence;
    
    
    
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
    * Cards from the player's hand will exchange with those on the field.
    */
    public void exchange(int a)
    {
        Card card = playerHand.get(a);
        Card card2 = Field.getCard(a);
        if (playerHand.size() < 7)
        {
            playerHand.add(card2);
        }
        Field.addToField(card);
    }
    
    public void take(int a)
    {
        if (playerHand.size() == 7)
        {
            return;
        }
        playerHand.add(Field.fieldCard.get(a));
    }
   
    public void takeCamels()
    {
        ArrayList<Camel> herd = Field.camelHerd();
        for (int a = 0; a < playerHand.size(); a++)
        {
            while (playerHand.size() < 7)
            {
                playerHand.add(herd.get(a));
            }
        }
    }
    
    public static BonusToken sellCard(Card card, int amount)
    {
        ArrayList<Card> sell = new ArrayList<Card>();
        BonusToken token = new BonusToken(amount);
        playerStack.add(token);
        for (int a = 0; a <= amount; a++)
        {
            sell.add(card);
        }
        for (int a = 0; a < sell.size(); a++)
        {
            Discard.addToPile(sell.get(a));
        }
        return token;
    }
    
    
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
        else
        {
            player2.sealOfExcellence += 1;
        }
    }
    
    public ArrayList<Card> getHand()
    {
        return playerHand;
    }
    
    public ArrayList getStack()
    {
        return playerStack;
    }
    
    public int getSeals()
    {
        return sealOfExcellence;
    }
    
}
