import java.util.ArrayList;

/**
* Constructor for class Deck
*/
public class Deck
{
    public ArrayList<Card>goodsCard;
    public Deck()
    {
        ArrayList<Card> diamond = new ArrayList<Card>();
        for (int a = 0; a <= 6; a++)
        {
            diamond.add((new Card("Diamond")));
        }
        ArrayList<Card> gold = new ArrayList<Card>();
        for(int a = 0; a <= 6; a++)
        {
            gold.add((new Card("Gold")));
        }
        ArrayList<Card>Silver = new ArrayList<Card>();
        for(int a = 0; a<= 6; a++)
        {
            Silver.add((new Card("Silver")));
        }
        ArrayList<Card>Cloth = new ArrayList<Card>();
        for(int a = 0; a <= 8; a++)
        {
            Cloth.add((new Card("Cloth")));
        }
        ArrayList<Card>Spice = new ArrayList<Card>();
        for(int a = 0; a <= 8; a++)
        {
            Spice.add((new Card("Spice")));
        }
        ArrayList<Card>Leather = new ArrayList<Card>();
        for(int a = 0; a<= 10; a++)
        {
            Leather.add((new Card("Leather")));
        }
        ArrayList<Card>Camel = new ArrayList<Card>();
        for(int a= 0;a<=11;a++)
        {
            Camel.add((new Card("Camel")));
        }
        for(int Good = 0; Good <= 55; Good++)
        {
            goodsCard.add(diamond.get(Good));
            goodsCard.add(gold.get(Good));
            goodsCard.add(Silver.get(Good));
            goodsCard.add(Cloth.get(Good));
            goodsCard.add(Spice.get(Good));
            goodsCard.add(Leather.get(Good));
            goodsCard.add(Camel.get(Good));
        }
    }
    
    public boolean isEmpty()
    {
        return goodsCard.isEmpty();
    }
    
    public  Card drawCard()
    {
        return goodsCard.get(0);
    }
}
