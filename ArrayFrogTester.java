/**
 * A Java tester program for class ArrayFrog.
 *
 * @author Qi Yang
 * @version 2021-05-11
 */
public class ArrayFrogTester
{
    public static void main(String[] args)
    {
        Frog[] arrayOne = new Frog[5];
        int count = 3;
        arrayOne[0] = new Frog("12345", 15);
        arrayOne[1] = new Frog("55555", 16);
        arrayOne[2] = new Frog("66666", 20);
        
        ArrayFrog managedArrayOne = new ArrayFrog(arrayOne, count);
        
        // Testing method toString()
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=12345,Weight=15,Legs=2], " +
            "Frog[ID=55555,Weight=16,Legs=2], Frog[ID=66666,Weight=20,Legs=2]]");
           
        // Testing method sort()
        managedArrayOne.sort();
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=12345,Weight=15,Legs=2], " +
            "Frog[ID=55555,Weight=16,Legs=2], Frog[ID=66666,Weight=20,Legs=2]]");
        
        // Testing method add()
        managedArrayOne.add(new Frog("88888", 15));
        managedArrayOne.add(new Frog("44444", 16));
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=12345,Weight=15,Legs=2], " +
            "Frog[ID=55555,Weight=16,Legs=2], Frog[ID=66666,Weight=20,Legs=2], " +
            "Frog[ID=88888,Weight=15,Legs=2], Frog[ID=44444,Weight=16,Legs=2]]");

        // Testing method sort()
        managedArrayOne.sort();
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=12345,Weight=15,Legs=2], " +
            "Frog[ID=88888,Weight=15,Legs=2], Frog[ID=44444,Weight=16,Legs=2], " +
            "Frog[ID=55555,Weight=16,Legs=2], Frog[ID=66666,Weight=20,Legs=2]]");
            
        // Testing invalid adding
        managedArrayOne.add(new Frog("99999", 14));
        managedArrayOne.add(new Frog("00000", 14));
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=12345,Weight=15,Legs=2], " +
            "Frog[ID=88888,Weight=15,Legs=2], Frog[ID=44444,Weight=16,Legs=2], " +
            "Frog[ID=55555,Weight=16,Legs=2], Frog[ID=66666,Weight=20,Legs=2]]");

        // Testing valid deleting
        managedArrayOne.delete(4);
        managedArrayOne.delete(0);
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=88888,Weight=15,Legs=2], " +
            "Frog[ID=44444,Weight=16,Legs=2], Frog[ID=55555,Weight=16,Legs=2]]");
        
        // Testing invalid deleting
        managedArrayOne.delete(4);
        managedArrayOne.delete(-1);
        System.out.println(managedArrayOne.toString());
        System.out.println("Expected: [Frog[ID=88888,Weight=15,Legs=2], " +
            "Frog[ID=44444,Weight=16,Legs=2], Frog[ID=55555,Weight=16,Legs=2]]");
    }
}
