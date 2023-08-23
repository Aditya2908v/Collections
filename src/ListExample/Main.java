package ListExample;

/*
 * List interface in Java provides a way to store the ordered collection.
 * Duplicate values can be stored.
 * List preserves the insertion order, it allows positional access and insertion of elements.

 * Implementation classes of the List Interface are
 *              1) ArrayList
 *              2) LinkedList
 *              3) Stack
 *
 * Operations in Java List Interface
 *      Adding - add()
 *      Updating - set()
 *      Searching - indexOf()
 *      Removing - remove()
 *      Accessing - get()
 *      Checking - contains()
 */



import java.util.*;
public class Main {
    public static void main(String[] args){
        List<String> indianTeam = new ArrayList<>();

        //adding elements to the ArrayList
        indianTeam.add("Rohith Shamra");
        indianTeam.add("Gill");
        indianTeam.add("Virat Kohli");
        indianTeam.add("Shreyas Iyer");

        System.out.println(indianTeam);

        indianTeam.add(2, "Shikar Dhawan");

        System.out.println(indianTeam);

        String player = indianTeam.get(3);
        System.out.println(player);

        // remaining methods are remove and contains

    }
}
