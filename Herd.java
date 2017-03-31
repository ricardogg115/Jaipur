import java.util.ArrayList;
/**
 * The Herd class stores Camel cards in order to have a way of finding which
 * player will get the token or other extra attribute of the game that involve the amount of camel cards.
 * @author (Diana Olmos) 
 * @version (version 1)
 */
public class Herd
{
    private ArrayList<Camel> camelHerd;
    
    /**
     * Adds Camels to camelHerd from the field object.
     * @param field Field object
     */
    public void addToHerd(Field field)
    {
        for (int i = 0; i < camelHerd.size(); i++)
        {
            camelHerd.add(field.camelHerd().get(i));
        }
    }
}
