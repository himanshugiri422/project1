import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList object
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some values to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Print the values in the linked list
        System.out.println("Values in the linked list:");
        for (int value : linkedList) {
            System.out.println(value);
        }
    }
}
