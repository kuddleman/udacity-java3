package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<>();
        List<Person> people = new ArrayList<>();

        Person p1 = new Person("p1", "email1");
        Person p2 = new Person("p2", "email2");
        Person p3 = new Person("p3", "email3");
        Person p4 = new Person("p4", "email4");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for (Person onePerson : people) {
            mapOfPeople.put(onePerson.getEmail(), onePerson);
        }

        System.out.println(mapOfPeople.get("email2"));

//        mapOfPeople.put(p1.getName(), p1);
//        mapOfPeople.put(p2.getName(), p2);
//        mapOfPeople.put(p3.getName(), p3);
//        mapOfPeople.put(p4.getName(), p4);

    }
}
