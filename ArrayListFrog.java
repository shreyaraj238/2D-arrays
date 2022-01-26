// Step 1: Import class ArrayList
import java.util.ArrayList;
/**
 * Manages an array list of class Frog.
 *
 * Step 2: Enter your name for @author and the password for @version
 * @author  Shreya Raj
 * @version 12-4
 */
public class ArrayListFrog
{
    public static final int LOW_LIMIT = 15;
    public static final int HIGH_LIMIT = 20;

    // Step 3: Declare an instance variable for
    //         the array list to be managed
    private ArrayList<Frog> frogList;
    
    // Step 4: Complete the constructor
    /**
     * Constructor for objects of class ArrayListFrog.
     * 
     * @param aList the array list of class Frog
     *        to be managed
     */
    public ArrayListFrog(ArrayList<Frog> aList)
    {
        frogList = aList;
    }

    // Step 5: Complete method add()
    /**
     * Adds a frog to the array list at a specified 
     * position if the specified index is valid and 
     * does nothing otherwise.
     *
     * @param index the specified position to add 
     * @param frog the frog to be added
     */
    public void add(int index, Frog frog)
    {
        if(index >= 0 && index <= frogList.size())
        {
            frogList.add(index, frog);
        }
    }
    
    // Step 6: Complete method delete()
    /**
     * Deletes the frog at the specified position if
     * index is valid and does nothing otherwise.
     * 
     * @param index the index of the frog to be deleted 
     *        from the array list
     * @return the frog deleted if index is valid
     *         null if the index is invalid
     */
    public Frog delete(int index)
    {
        Frog frogRemoved = null;
        
        if(index >= 0 && index < frogList.size())
        {
            frogRemoved = frogList.remove(index);
        }
        
        return frogRemoved;
    }
    
    // Step 7: Complete method swap()
    /**
     * Swaps two frogs at specified positions in the array
     * list if both index1 and index2 are valid and does
     * nothing otherwise.
     * 
     * @param index1 the index of the first frog to be swapped
     * @param index2 the index of the second frog to be swapped
     */
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0 && index1 < frogList.size() && index2 < frogList.size())
        {
            Frog temp = frogList.get(index1);
            frogList.set(index1, frogList.get(index2));
            frogList.set(index2, temp);
        }
    }

    // Step 8: Complete method firstInTheRange()
    /**
     * Gets a string representation for the array list.
     * 
     * @return the string returned by the toString() method
     *         on the array list
     */
    @Override
    public String toString()
    {
        return frogList.toString();
    }

    // Step 9: Complete method firstInTheRange()
    /**
     * Gets the first frog in the array list whose weight 
     * is in the range of [LOW_LIMIT, HIGH_LIMIT].
     * 
     * You should use the enhanced for loop.
     * 
     * @return the first frog whose weight is in the specified range
     *         null if no such frog in the array list
     */
    public Frog firstInTheRange()
    {
        Frog correctFrog = null;
        
        for(Frog f: frogList)
        {
            int weight = f.getWeight();
            if(weight >= LOW_LIMIT && weight <= HIGH_LIMIT)
            {
                correctFrog = f;
                break;
            }
        }
        
        return correctFrog;
    }
}
