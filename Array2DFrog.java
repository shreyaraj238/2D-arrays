/**
 * Store a 2-D array of class Frog and retrieve 
 * information from the 2-D array.
 * @author  Shreya Raj
 * @version 12-4
 */
public class Array2DFrog
{
    public static final int LOW_LIMIT = 19;
    public static final int HIGH_LIMIT = 21;
    
    private Frog[][] frog2D;
    
    public Array2DFrog(Frog[][] array)
    {
        frog2D = array;
    }
    
    /**
     * Gets the average weight of all frogs in the 2-D array.
     * We assume the 2-D array is not empty and not partial.
     */
    public double averageWeight()
    {
        double total = 0;
        double count = 0;
        
        for(Frog[] row: frog2D)
        {
            for(Frog f: row)
            {
                count++;
                total += f.getWeight();
            }
        }
        
        return (total / count);
    }
    
    /**
     * Gets the last frog in the specified row whose weight
     * is in the range of [LOW_LIMIT, HIGH_LIMIT].
     * We assume the 2-D array is not empty and not partial.
     */
    public Frog lastInTheRangeOfARow(int rowIndex)
    {
        int cols = frog2D[0].length;
        
        for(int i = cols - 1; i >= 0; i--)
        {
            int weight = frog2D[rowIndex][i].getWeight();
            if (weight >= LOW_LIMIT && weight <= HIGH_LIMIT)
            {
                return frog2D[rowIndex][i];
            }
        }
        return null;
    }
    
    /**
     * Gets the first frog with the max weight among all frogs 
     * in a specified column.
     * We assume the 2-D array is not empty and not partial.
     */
    public Frog maxOfACol(int colIndex)
    {
        int rows = frog2D.length;
        int max = 0;
        Frog heaviestFrog = null;
        
        for(int r = 0; r < rows; r++)
        {
            Frog currentFrog = frog2D[r][colIndex];
            int weight = currentFrog.getWeight();
            if(weight > max)
            {
                max = weight;
                heaviestFrog = currentFrog;
            }
        }
        
        return heaviestFrog;
    }
}
