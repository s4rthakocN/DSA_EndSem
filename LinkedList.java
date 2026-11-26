class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    void insertAtBeginning (int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        
    }
}
