/**
 * A Java class models frog objects. Each frog
 * has an id, a weight, and a number of legs.
 * A frog has no legs if its weight is at most 5,
 * 4 legs if its weight is more than 20, and 2
 * legs otherwise.
 * @author  Shreya Raj
 * @version 
 */

public class Frog implements Comparable
{
    public static final int MIN_WEIGHT = 1;
    public static final int MED_WEIGHT = 5;
    public static final int BIG_WEIGHT = 20;
    public static final int MED_LEGS = 2;
    public static final int BIG_LEGS = 4;
    
    private int weight;
    private int numLegs;
    private String id;
    
    public Frog(String s, int w)
    {
        id = s;
        if(w <= 0)
        {
            weight = MIN_WEIGHT;
        }
        else
        {
            weight = w;
        }
        if(weight >= MIN_WEIGHT && weight <= MED_WEIGHT)
        {
            numLegs = 0;
        }
        else if(weight > MED_WEIGHT && weight <= BIG_WEIGHT)
        {
            numLegs = MED_LEGS;
        }
        else
        {
            numLegs = BIG_LEGS;
        }
    }
  
    public String getID()
    {
        return id;
    }
   
    public int getWeight()
    {
        return weight;
    }

    public void grow (int amount)
    {
       if(amount > 0)
       {
           weight = weight + amount;
           if(weight >= MIN_WEIGHT && weight <= MED_WEIGHT)
            {
                numLegs = 0;
            }
            else if(weight > MED_WEIGHT && weight <= BIG_WEIGHT)
            {
                numLegs = MED_LEGS;
            }
            else
            {
                numLegs = BIG_LEGS;
            }
       }
    }
    
    public String toString()
    {
       return "Frog[ID=" + id + ",Weight=" + weight + ",Legs=" + numLegs + "]";
    }
    
    public int compareTo(Object obj)
    {
       Frog frog2 = (Frog) obj;
       int result = Double.compare(this.weight, frog2.weight);
        
       if(result == 0)
       {
           result = this.id.compareTo(frog2.id);
       }
       return result;
    }
}
