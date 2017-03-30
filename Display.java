import java.util.ArrayList;
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display
{
    /**
     * Displays the player's stats: hand, stack and number of seals.
     * @param player player object
     * @param a indicates player number
     */
    public static void displayPlayer(Player player, int a)
    {
        System.out.println();
        displayHand(player,a);
        displayStack(player,a);
        displayNumSeals(player,a);
        
    }
    
    /**
     * Displays the player's hand.
     * @param player player object
     * @param a indicates player number
     */
    public static void displayHand(Player player, int a)
    {
        ArrayList<Card> newHand = player.getHand();
        System.out.println("Player " + a + " Hand:");
        for (Card card : newHand)
        {
            System.out.print(card.getType() + " ");
        }
    }
    
    /**
     * Displays the player's stack.
     * @param player player object
     * @param a indicates player number
     */
    public static void displayStack(Player player,int a)
    {
        ArrayList<Token> newStack = player.getStack();
        System.out.println();
        System.out.println("Player " + a + " Stack:");
        for (Token token : newStack)
        {
            System.out.print(" " + token.getValue());
            System.out.print("  " + token.getType() + " ");
        }
    }
    
    /**
     * Displays the player's number of seals.
     * @param player player object
     * @param a indicates player number
     */
    public static void displayNumSeals(Player player, int a)
    {
        System.out.println();
        System.out.println("Player " + a + " Seals:");
        int token = player.getSeals();
        System.out.println(token);
    }
    
    
}
