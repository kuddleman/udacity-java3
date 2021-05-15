package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Bunny");
        myList.add("Crocker");
        myList.add("Waif");
        myList.add("Sleepy");

        Collections.sort(myList);

        for (String name : myList) {
            System.out.println(name);
        }

    }
}
