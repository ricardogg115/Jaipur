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
    public void exchange()
    {
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
    
    //public static BonusToken sellCard(Card card, int amount)
    //{
    //}
    
    
    public void winRound(Player player1, Player player2)
    {
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
