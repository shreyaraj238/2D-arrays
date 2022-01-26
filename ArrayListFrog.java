import java.util.ArrayList;
/**
 * Manages an array list of class Frog.
 *
 * @author  Shreya Raj
 * @version 12-4
 */
public class ArrayListFrog
{
    public static final int LOW_LIMIT = 15;
    public static final int HIGH_LIMIT = 20;

    private ArrayList<Frog> frogList;
    
    public ArrayListFrog(ArrayList<Frog> aList)
    {
        frogList = aList;
    }

    public void add(int index, Frog frog)
    {
        if(index >= 0 && index <= frogList.size())
        {
            frogList.add(index, frog);
        }
    }
    
    public Frog delete(int index)
    {
        Frog frogRemoved = null;
        
        if(index >= 0 && index < frogList.size())
        {
            frogRemoved = frogList.remove(index);
        }
        
        return frogRemoved;
    }
    
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0 && index1 < frogList.size() && index2 < frogList.size())
        {
            Frog temp = frogList.get(index1);
            frogList.set(index1, frogList.get(index2));
            frogList.set(index2, temp);
        }
    }

    @Override
    public String toString()
    {
        return frogList.toString();
    }

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
