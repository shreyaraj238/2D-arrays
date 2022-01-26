/**
 * A Java class models frog objects. Each frog
 * has an id, a weight, and a number of legs.
 * A frog has no legs if its weight is at most 5,
 * 4 legs if its weight is more than 20, and 2
 * legs otherwise.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author  Shreya Raj
 * @version 
 */
// Step 2: Implement interface Comparable
public class Frog implements Comparable
{
    public static final int MIN_WEIGHT = 1;
    public static final int MED_WEIGHT = 5;
    public static final int BIG_WEIGHT = 20;
    public static final int MED_LEGS = 2;
    public static final int BIG_LEGS = 4;
    
    // Step 3: Declare three instance variables
    private int weight;
    private int numLegs;
    private String id;
    
    
    // Step 4: Complete the constructor
    /**
     * Constructor for objects of class Frog.
     * Assume the id parameter (s) is a good string, but
     * the weight parameter (w) may not be positive and
     * the weight will be set to MIN_WEIGHT
     * if it is the case. The constructor will
     * also determine the number of legs of
     * this frog based on the weight.
     * 
     * @param s the id of this frog 
     * @param w the weight of this frog 
     */
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

    // Step 5: Complete method getID()
    /**
     * Gets the id of this frog.
     * 
     * @return the weight of this frog 
     */
    public String getID()
    {
        return id;
    }
    
    // Step 6: Complete method getWeight()
    /**
     * Gets the weight of this frog.
     * 
     * @return the weight of this Frog 
     */
    public int getWeight()
    {
        return weight;
    }
    
    // Step 7: Complete method grow()
    /**
     * Grows this frog by increasing its weight and adjusting its
     * number of legs. It does nothing if amount is not positive.
     *
     * @param  amount the amount to grow this frog's weight
     */
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
    
    // Step 8: Complete method toString()
    /**
     * Gets a string presentation for this frog.
     * 
     * @return a string for this frog including id, 
     *         weight and number of legs in the format
     *         "Frog[ID=1234,Weight=10,Legs=2]"
     */
    public String toString()
    {
       return "Frog[ID=" + id + ",Weight=" + weight + ",Legs=" + numLegs + "]";
    }
    
    // Step 9: Implements method compareTo() for interface
    //         Comparable
    /**
     * Implements method compareTo() for interface
     * Comparable by comparing the weight first 
     * then the id.
     * 
     * @param obj another Frog object to compare to 
     * @return an integer indicating the comparison result.
     */
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
