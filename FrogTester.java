/**
 * A Java tester program for class Frog.
 *
 * @author Qi Yang
 * @version 2021-05-11
 */
public class FrogTester
{
    public static void main(String[] args)
    {
        Frog frogOne = new Frog("12345", 0);
        System.out.println(frogOne.toString());
        System.out.println("Expected: Frog[ID=12345,Weight=1,Legs=0]");

        frogOne.grow(4);
        System.out.println(frogOne.toString());
        System.out.println("Expected: Frog[ID=12345,Weight=5,Legs=0]");
        
        frogOne.grow(1);
        System.out.println(frogOne.toString());
        System.out.println("Expected: Frog[ID=12345,Weight=6,Legs=2]");
            
        Frog frogTwo = new Frog("54321", -15);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=54321,Weight=1,Legs=0]");
            
        frogTwo = new Frog("55555", 15);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=55555,Weight=15,Legs=2]");
            
        frogTwo.grow(5);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=55555,Weight=20,Legs=2]");
        
        frogTwo.grow(-5);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=55555,Weight=20,Legs=2]");
            
        frogTwo.grow(1);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=55555,Weight=21,Legs=4]");
            
        frogTwo.grow(2);
        System.out.println(frogTwo.toString());
        System.out.println("Expected: Frog[ID=55555,Weight=23,Legs=4]");
    }
}
