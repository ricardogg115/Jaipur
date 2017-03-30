import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jaipur
{
    private static Scanner player1Scan = new Scanner(System.in);
    private static Scanner player2Scan = new Scanner(System.in);
    private static ArrayList<Token> player1Stack = new ArrayList<Token>();
    private static ArrayList<Token> player2Stack = new ArrayList<Token>();
    private static ArrayList<Card> player1Hand = new ArrayList<Card>();
    private static ArrayList<Card> player2Hand = new ArrayList<Card>();
    private static ArrayList<Camel> player1Herd = new ArrayList<Camel>();
    private static ArrayList<Camel> player2Herd = new ArrayList<Camel>();
    private static int player1Seal = 0;        
    private static int player2Seal = 0;
    private static Deck mainDeck = new Deck();
    private static Field playingField = new Field(mainDeck);
    private static Stack diamondStack = new Stack("Diamond");
    private static Stack goldStack = new Stack("Gold");
    private static Stack silverStack = new Stack("Silver");
    private static Stack spiceStack = new Stack("Spice");
    private static Stack silkStack = new Stack("Silk");    
    private static Stack leatherStack = new Stack("Leather");
            
    private static Player player1 = new Player(player1Hand,player1Stack,player1Seal);
    private static Player player2 = new Player(player2Hand,player2Stack,player2Seal);
    
    
    public static void main(String args[])
    {
        playGame();
    }
    
        
    /**
     * Returns true if at least three stacks are empty.
     */
    public static boolean isThreeEmpty()
    {
        int num = 0;
        ArrayList<Stack> stackList = new ArrayList<Stack>(){{
            add(diamondStack);
            add(goldStack);
            add(silverStack);
            add(spiceStack);
            add(silkStack);
            add(leatherStack);
        }};
            
        for (Stack stack : stackList)
        {
            if (stack.isEmpty())
            {
                num++;
            }
        }
        return num == 3;
    }
    
    /**
     * Plays the entire game of Jaipur.
     */
    public static void playGame()
    {
        for (int a = 0; a < 5; a++)
        {
            player1Hand.add(mainDeck.drawCard());
        }
        for (int b = 0; b < 5; b++)
        {
            player2Hand.add(mainDeck.drawCard());
        }
        Display.displayPlayer(player1,1);
        System.out.println();
        System.out.println();
        Display.displayPlayer(player2,2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(playingField.toString());     
        System.out.println();
        System.out.println();
        System.out.println();
        while (player1Seal != 2 && player2Seal != 2)
        {
            round();
        }
    }
    
    /**
     * If two player's stack values are the same at the end of a round, then the player with
     * the most Bonus Tokens wins the Seal of Excellence.
     */
    public static void tieBreaker()
    {
        int value1 = 0;
        int value2 = 0;
        for (Token token : player1Stack)
        {
            if (token instanceof BonusToken)
            {
                value1++;
            }            
        }
        for (Token token1 : player2Stack)
        {
            if (token1 instanceof BonusToken)
            {
                value2++;
            }
            
        }
        
        if (value1 > value2)
        {
            player1Seal++;
        }
        player2Seal++;
              
    }
    
    /**
     * Simulates one round of Jaipur and adds a Seal of Excellence to a player if they have the most points,
     * which are generated by the values of their tokens in their stack.
     */
    public static void round()
    {
        while ((!mainDeck.isEmpty() || !isThreeEmpty()) && (player1Seal == 0 || player2Seal == 0))
        {
        System.out.println("Select an option: 1 for exchange, 2 to take one, 3 for all camels, 4 to sell cards"); 
        int value = player1Scan.nextInt();
        
        
        switch (value)
        {
            case 1 : if (player1Hand.size() != 0)
                        {
                            System.out.println("Choose which card you wish to exchange on the field.");
                            value = player1Scan.nextInt();
                            player1.exchange(playingField,value);
                        }
                        break;
            case 2 : System.out.println("Select which one you wish to take from the field.");                     
                     value = player1Scan.nextInt();
                     player1.takeOne(playingField,value);
                     playingField.addToField(mainDeck.drawCard());
                     break;
            case 3 : player1.takeCamels(playingField);
                     playingField.addToField(mainDeck.drawCard());
                     break;                     
            case 4 : System.out.println("Choose which card you would like to sell.");                     
                     value = player1Scan.nextInt();
                     Card card = player1Hand.get(value);
                     System.out.println("How many do you want to sell?");
                     int value2 = player1Scan.nextInt();
                     player1.sellCard(card,value2);
                     break;
                     
        }
        System.out.println();
        System.out.println();
        System.out.println();
        Display.displayPlayer(player1,1);
        System.out.println();
        System.out.println();
        System.out.println(playingField.toString());
        System.out.println("Select an option: 1 for exchange, 2 to take one, 3 for all camels, 4 to sell cards"); 
        int value3 = player2Scan.nextInt();  
        
        
        switch (value3)
        {
            case 1 : if (player2Hand.size() != 0)
                        {
                            System.out.println("Choose which card you wish to exchange on the field.");
                            value3 = player2Scan.nextInt();
                            player2.exchange(playingField,value3);
                        }
                        break;
            case 2 : System.out.println("Select which one you wish to take from the field.");
                     value3 = player2Scan.nextInt();
                     player2.takeOne(playingField,value3);
                     playingField.addToField(mainDeck.drawCard());
                     break;
            case 3 : player2.takeCamels(playingField);
                     playingField.addToField(mainDeck.drawCard());
                     break;                     
            case 4 : System.out.println("Choose which card you would like to sell.");                     
                     value3 = player2Scan.nextInt();
                     Card card = player2Hand.get(value);
                     System.out.println("How many do you want to sell?");
                     int value4 = player2Scan.nextInt();
                     player2Stack.add(player2.sellCard(card,value4));
                     break;
                     
        }
        System.out.println();
        System.out.println();
        System.out.println();
        Display.displayPlayer(player2,2);
        System.out.println();
        System.out.println();
        System.out.println(playingField.toString());
      }
      
      
      int player1 = 0;
      int player2 = 0;
      
      
      for (int a = 0; a < player1Stack.size(); a++)
      {
          player1 += player1Stack.get(a).getValue();
      }
      for (int b = 0; b < player2Stack.size(); b++)
      {
          player2 += player2Stack.get(b).getValue();
      }
      
      if (player1 > player2)
      {
          player1Seal++;
      }
      else
      {
          player2Seal++;
      }
      
       if(player1 == player2)
      {
          tieBreaker();
      }
      
    }
    
}
