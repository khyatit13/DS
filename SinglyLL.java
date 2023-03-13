public class SinglyLL {

    private Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "---");
            current = current.next;
        }

    }

    public static void main(String[] args) {

        SinglyLL sl = new SinglyLL();

        sl.head = new Node(5);
        Node l1 = new Node(1);
        Node l2 = new Node(4);
        Node l3 = new Node(2);

        sl.head.next = l1;
        l1.next = l2;
        l2.next = l3;

        sl.printLL();

    }

}
