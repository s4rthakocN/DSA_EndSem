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
        System.out.println("null") ;
    }


    void insertAtIndex(int data, int index) {

        if (index < 0) {
            System.out.println("invalid index");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                System.out.println("invalid index");
                return;
                }

            temp = temp.next;
            }

        if (temp == null) {
            System.out.println("invalid index");
            return;
            }

        newNode.next = temp.next;
        temp.next = newNode;
        }


    void deleteAtIndex(int index) {

        if (index < 0 || head == null) {
            System.out.println("invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {

            if (temp.next == null) {
                System.out.println("invalid index");
                return;
            }

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid index");
            return;
        }
        temp.next = temp.next.next;
    }

}

public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertAtBeginning(0);
        list.insertAtEnd(2);

        list.display();
    }
}
