
package inclass;


public class Question03 {
    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    
    public class LinkedList{
        private Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        
         public void remove(int data) {
            if (head == null) {
                System.out.println("List is empty. Nothing to remove.");
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }

            if (current.next == null) {
                System.out.println("Value " + data + " not found in the list.");
            } else {
                current.next = current.next.next;
            }
        }


        
        public void display() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }


    }
    
     public static void main(String[] args) {
        Question03 outer = new Question03();  // Create an instance of the outer class
        LinkedList list = outer.new LinkedList();  // Create an instance of the inner class

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        // Removing an element
        list.remove(20);
        list.display(); // Output: 10 -> 30 -> null

        // Attempting to remove an element not in the list
        list.remove(50); // Output: Value 50 not found in the list.

        // Removing the head node
        list.remove(10);
        list.display(); // Output: 30 -> null

        // Removing from an empty list
        list.remove(30);
        list.remove(40); // Output: List is empty. Nothing to remove.
}

}
