
public class LinkedList {
    Node head;
    
    public void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head = newNode;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+ " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(23);
        list.insertAtBegin(45);
        list.printList();

    }

     // Medium Challenge: Delete by key
     public void deleteByKey(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
