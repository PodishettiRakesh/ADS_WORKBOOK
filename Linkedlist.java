// class LinkedList {
//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int d) {
//             data = d;
//             next = null;
//         }
//     }

//     // Method to insert a node at the beginning
//     public void insertAtBeginning(int newData) {
//         Node newNode = new Node(newData);
//         newNode.next = head;
//         head = newNode;
//     }

//     // Method to print the LinkedList
//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.insertAtBeginning(10);
//         list.insertAtBeginning(20);
//         list.insertAtBeginning(30);
//         System.out.println("Linked list after insertion:");
//         list.printList();
//     }
// }



// class LinkedList {
//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int d) {
//             data = d;
//             next = null;
//         }
//     }

//     // Method to insert a node at the beginning
//     public void insertAtBeginning(int newData) {
//         Node newNode = new Node(newData);
//         newNode.next = head;
//         head = newNode;
//     }

//     // Method to delete a node by key
//     public void deleteNode(int key) {
//         Node temp = head, prev = null;

//         // If head node itself holds the key to be deleted
//         if (temp != null && temp.data == key) {
//             head = temp.next; // Changed head
//             return;
//         }

//         // Search for the key to be deleted, keep track of the previous node
//         while (temp != null && temp.data != key) {
//             prev = temp;
//             temp = temp.next;
//         }

//         // If key was not present in the list
//         if (temp == null) return;

//         // Unlink the node from the linked list
//         prev.next = temp.next;
//     }

//     // Method to print the LinkedList
//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.insertAtBeginning(10);
//         list.insertAtBeginning(20);
//         list.insertAtBeginning(30);
//         System.out.println("Linked list after insertion:");
//         list.printList();

//         list.deleteNode(20);
//         System.out.println("Linked list after deletion of 20:");
//         list.printList();
//     }
// }



// class LinkedList {
//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int d) {
//             data = d;
//             next = null;
//         }
//     }

//     // Method to insert a node at the beginning
//     public void insertAtBeginning(int newData) {
//         Node newNode = new Node(newData);
//         newNode.next = head;
//         head = newNode;
//     }

//     // Method to reverse the linked list
//     public void reverseList() {
//         Node prev = null;
//         Node current = head;
//         Node next = null;
//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         head = prev;
//     }

//     // Method to print the LinkedList
//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.insertAtBeginning(10);
//         list.insertAtBeginning(20);
//         list.insertAtBeginning(30);
//         System.out.println("Linked list after insertion:");
//         list.printList();

//         list.reverseList();
//         System.out.println("Reversed linked list:");
//         list.printList();
//     }
// }
