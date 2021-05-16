package queueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<String> queuedCustomers = new LinkedList<>();
        queuedCustomers.add("me");
        queuedCustomers.add("you");
        queuedCustomers.add("he");
        queuedCustomers.add("she");
        queuedCustomers.add("us");

        while(!queuedCustomers.isEmpty()) {
            System.out.println(
                    "Customer " + queuedCustomers.poll()
                    + " is getting helped."
            );
        }
    }
}
