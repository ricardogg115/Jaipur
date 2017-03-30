/**
 * The Display Class is designed to display game elements with Strings.
 * @author (Horus Hernandez) 
 * @version (3/1/2017)
 */
 
  /**     * Displays the player's stats: hand, stack and number of seals.
		* @param player player object     
		* @param a indicates player number     
		*/    public static void displayPlayer(Player player, int a)    
		{       
			System.out.println();       
			displayHand(player,a);        
			displayStack(player,a);       
			displayNumSeals(player,a);           
		}

  
