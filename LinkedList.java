
public class LinkedList {
    Node head;
    
    public void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(23);
        list.insertAtBegin(45);

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
