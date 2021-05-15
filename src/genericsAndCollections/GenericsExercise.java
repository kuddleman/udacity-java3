package genericsAndCollections;

import java.util.ArrayList;

public class GenericsExercise {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();
        Double doubleNumber = 1.5;
        Character letter = 'a';
        String name = "Sally";
        Integer intNumber = 1;

        variables.add(doubleNumber);
        variables.add(letter);
        variables.add(name);
        variables.add(intNumber);

        for(Object variable : variables) {
            displayClassName(variable);
        }
    }

    static<T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());
    }
}
