package inclass;

import java.util.LinkedList;

public class Question04 {
    public static void main(String[] args) {
        // Create a LinkedList of student names
        LinkedList<String> students = new LinkedList<>();

        // I. Add students to the list
        students.add("Alice");  // Add "Alice" at the end
        students.add("Bob");    // Add "Bob" at the end
        students.add("Charle"); // Add "Charle" at the end
        students.add("Diana");  // Add "Diana" at the end

        // II. Display the list after adding the students
        System.out.println("List after adding students: " + students);

        // III. Remove the third student
        if (students.size() >= 3) {
            students.remove(2); // Index 2 corresponds to the third student
        }
        System.out.println("List after removing the third student: " + students);
        
        // IV. Remove the first student
        if (!students.isEmpty()) {
            students.removeFirst();
        }
        System.out.println("List after removing the first student: " + students);

        // V. Remove the last student
        if (!students.isEmpty()) {
            students.removeLast();
        }
        System.out.println("List after removing the last student: " + students);

        // VI. Check if "Alice" is in the list
        boolean containsAlice = students.contains("Alice");
        System.out.println("Is 'Alice' in the list? " + containsAlice);


    } 
}
