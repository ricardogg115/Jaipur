import java.util.ArrayList;
/**
 * Write a description of class Herd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        for (int a = 0; a < camelHerd.size(); a++)
        {
            camelHerd.add(field.camelHerd().get(a));
        }
    }
}
