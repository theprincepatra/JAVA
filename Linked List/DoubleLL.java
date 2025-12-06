public class DoubleLL {
    public static void main(String[] args) {
        // list where all the nodes are stored
        DLL list = new DLL();

        list.insertFirst(3);       //  ----
        list.insertFirst(2);       //     |
        list.insertFirst(8);       //     |_____  call the insertFirst method to get node inserted
        list.insertFirst(17);      //     |
        list.insertFirst(25);      //     |
        list.insertFirst(34);      //  ----
        // list.insertAtIndex(2, 6);  calling to insert value in the index given
        
        list.display();
    }
}
class DLL{
    private Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

}
