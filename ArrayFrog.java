// Step 1: Import class Arrays
import java.util.Arrays;
/**
 * Manages an array of class Frog. The number of frogs
 * in the array needs to be kept correct at all times.
 *
 * Step 2: Enter your name for @author and the password for @version
 * @author  Shreya Raj
 * @version 12-4
 */
public class ArrayFrog
{
    // Step 3: Declare two instance variables to
    //         manage an array of Frog.
    private Frog[] frogArray;
    private int currentSize;
    
    // Step 4: Complete the constructor
    /**
     * Constructor for objects of class ArrayFrog.
     * 
     * @param array the array of class Frog to be managed
     * @param count the number of frogs in the array
     */
    public ArrayFrog(Frog[] array, int count)
    {
        frogArray = array;
        currentSize = count;
    }

    // Step 5: Complete method add()
    /**
     * Adds a frog at the end of the array if the array
     * is not full and does nothing otherwise.
     *
     * @param frog the frog to be added
     */
    public void add(Frog frog)
    {
        if(currentSize < frogArray.length)
        {
            frogArray[currentSize] = frog;
            currentSize++;
        }
    }
    
    // Step 6: Complete method delete()
    /**
     * Deletes the frog at the specified position and
     * maintains the order of other elements if index
     * is valid and does nothing otherwise.
     * 
     * @param index the index of the frog to be deleted 
     *        from the array
     * @return the frog deleted from the array if index is valid
     *         null if index is invalid
     */
    public Frog delete(int index)
    {
        Frog removed = null;
        if(index >= 0 && index < currentSize)
        {
            removed = frogArray[index];
            
            currentSize--;
            for(int i = index; i < currentSize; i++)
            {
                frogArray[i] = frogArray[i+1];
            }
        }
        return removed;
    }
    
    // Step 7: Complete method toString()
    /**
     * Gets a string representation for the array.
     * 
     * @return a String containing all frogs in the array 
     *         in the format 
     *         [Frog[...], Frog[...], ..., Frog[...]]
     *         where each Frog[...] is the string returned
     *         from method toString on a frog in the array
     */
    @Override
    public String toString()
    {
        String s = "[";
        
        for(int i = 0; i < currentSize - 1; i++)
        {
            s += frogArray[i].toString() + ", ";
        }
        Frog lastFrog = frogArray[currentSize - 1];
        return s + lastFrog.toString() + "]";
    }

    // Step 8: Complete method sort()
    /**
     * Calls a static method to sort the array.
     */
    public void sort()
    {
        Arrays.sort(frogArray, 0, currentSize);
    }
}