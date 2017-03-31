import java.util.ArrayList;
/**
 * Write a description of class Herd here.
 * 
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
