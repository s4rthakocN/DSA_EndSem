
class ReverseLinkedList {

    static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void reverseLinkedList(String[] args) {

        LL list = new LL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);

        list.display();

        list.head = reverse(list.head);

        list.display();
    }
}
