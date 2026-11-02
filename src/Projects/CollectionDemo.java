//EN
//It creates a Collection backed by an ArrayList, adds A, B, C, removes A, checks whether C is
//still present, then prints the result and the final contents.

package Projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> letters = new ArrayList<>(List.of("A", "B", "C"));

        boolean removed = letters.remove("A");
        boolean hasC = letters.contains("C");

        System.out.println("Removed A: " + removed);
        System.out.println("Contains C: " + hasC);
        System.out.println("Collection: " + letters);
    }
}