/**
 * A Java tester program for class Array2DFrog.
 *
 * @author Qi Yang
 * @version 2021-05-11
 */
public class Array2DFrogTester
{
    public static void main(String[] args)
    {
        Frog[][] arrayOne = {
                {new Frog("11aaa", 19), new Frog("12bbb", 6), new Frog("13ccc", 14)},
                {new Frog("21ddd", 17), new Frog("22eee", 5), new Frog("23fff", 21)},
                {new Frog("31ggg", 22), new Frog("32hhh", 1), new Frog("33iii", 18)},
                {new Frog("41jjj", 20), new Frog("42kkk", 2), new Frog("43lll", 21)},
                {new Frog("51mmm", 26), new Frog("52nnn", 4), new Frog("53ooo", 11)}};
        
        Array2DFrog storedArray2D = new Array2DFrog(arrayOne);
        
        // Testing method averageWeight()
        System.out.println(storedArray2D.averageWeight());
        System.out.println("Expected: 13.8");
           
        // Testing method lastInTheRangeOfARow()
        System.out.println(storedArray2D.lastInTheRangeOfARow(0));
        System.out.println("Expected: Frog[ID=11aaa,Weight=19,Legs=2]");
        System.out.println(storedArray2D.lastInTheRangeOfARow(2));
        System.out.println("Expected: null");
        System.out.println(storedArray2D.lastInTheRangeOfARow(3));
        System.out.println("Expected: Frog[ID=43lll,Weight=21,Legs=4]");
        
        // Testing method maxOfACol()
        Frog frog = storedArray2D.maxOfACol(0);
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=51mmm,Weight=26,Legs=4]");
        
        frog = storedArray2D.maxOfACol(1);
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=12bbb,Weight=6,Legs=2]");
        
        frog = storedArray2D.maxOfACol(2);
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=23fff,Weight=21,Legs=4]");
    }
}
