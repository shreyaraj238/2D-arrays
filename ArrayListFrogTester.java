import java.util.ArrayList;
/**
 * A Java tester program for class ArrayListFrog.
 *
 * @author Qi Yang
 * @version 2021-05-11
 */
public class ArrayListFrogTester
{
    public static void main(String[] args)
    {
        // Create a list without any elements
        ArrayListFrog listOne = new ArrayListFrog(new ArrayList<Frog>());
        
        // Create another list with 3 elements
        ArrayList<Frog> list = new ArrayList<Frog>();
        list.add(new Frog("54321", 15));
        list.add(new Frog("55555", 16));
        list.add(new Frog("66666", 20));
        ArrayListFrog listTwo = new ArrayListFrog(list);

        // Testing method toString()
        System.out.println(listOne.toString());
        System.out.println("Expected: []");
        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=54321,Weight=15,Legs=2], " +
                                      "Frog[ID=55555,Weight=16,Legs=2], " +
                                      "Frog[ID=66666,Weight=20,Legs=2]]");
        
        // Testing method firstInTheRange()
        System.out.println(listOne.firstInTheRange());
        System.out.println("Expected: null");
        System.out.println(listTwo.firstInTheRange());
        System.out.println("Expected: Frog[ID=54321,Weight=15,Legs=2]");

        // Testing method add()
        listTwo.add(3, new Frog("77777", 21));
        listTwo.add(0, new Frog("88888", 5));
        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=88888,Weight=5,Legs=0], " +
                                      "Frog[ID=54321,Weight=15,Legs=2], " +
                                      "Frog[ID=55555,Weight=16,Legs=2], " +
                                      "Frog[ID=66666,Weight=20,Legs=2], " +
                                      "Frog[ID=77777,Weight=21,Legs=4]]");
        System.out.println(listTwo.firstInTheRange());
        System.out.println("Expected: Frog[ID=54321,Weight=15,Legs=2]");


        // Testing method swap()
        listTwo.swap(0, 2);
        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=55555,Weight=16,Legs=2], " +
                                      "Frog[ID=54321,Weight=15,Legs=2], " +
                                      "Frog[ID=88888,Weight=5,Legs=0], " +
                                      "Frog[ID=66666,Weight=20,Legs=2], " +
                                      "Frog[ID=77777,Weight=21,Legs=4]]");
        System.out.println(listTwo.firstInTheRange());
        System.out.println("Expected: Frog[ID=55555,Weight=16,Legs=2]");
        
        listTwo.swap(4, 1);
        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=55555,Weight=16,Legs=2], " +
                                      "Frog[ID=77777,Weight=21,Legs=4], " +
                                      "Frog[ID=88888,Weight=5,Legs=0], " +
                                      "Frog[ID=66666,Weight=20,Legs=2], " +
                                      "Frog[ID=54321,Weight=15,Legs=2]]");

        // Testing invalid swapping
        listTwo.swap(5, 0);
        listTwo.swap(-1, 2);
        listTwo.swap(0, -2);
        listTwo.swap(1, 6);
        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=55555,Weight=16,Legs=2], " +
                                      "Frog[ID=77777,Weight=21,Legs=4], " +
                                      "Frog[ID=88888,Weight=5,Legs=0], " +
                                      "Frog[ID=66666,Weight=20,Legs=2], " +
                                      "Frog[ID=54321,Weight=15,Legs=2]]");

        // Testing method delete()
        Frog frog = listTwo.delete(0);        
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=55555,Weight=16,Legs=2]");

        frog = listTwo.delete(3);        
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=54321,Weight=15,Legs=2]");
        
        frog = listTwo.delete(1);        
        System.out.println(frog);
        System.out.println("Expected: Frog[ID=88888,Weight=5,Legs=0]");

        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=77777,Weight=21,Legs=4], " +
                                      "Frog[ID=66666,Weight=20,Legs=2]]");

        // Invalid deleting
        frog = listTwo.delete(2);
        System.out.println(frog);
        System.out.println("Expected: null");

        frog = listTwo.delete(-1);        
        System.out.println(frog);
        System.out.println("Expected: null");

        System.out.println(listTwo.toString());
        System.out.println("Expected: [Frog[ID=77777,Weight=21,Legs=4], " +
                                      "Frog[ID=66666,Weight=20,Legs=2]]");
    }
}
