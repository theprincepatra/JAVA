public class SingleLL {
    public static void main(String[] args) {
        // list where all the nodes are stored
        LL list = new LL();

        list.insertFirst(1);       //  ----
        list.insertFirst(12);      //     |
        list.insertFirst(123);     //     |_____  call the insertFirst method to get node inserted
        list.insertFirst(1234);    //     |
        list.insertFirst(12345);   //     |
        list.insertFirst(123456);  //  ----
        list.insertAtIndex(2, 6);  //calling to insert value in the index given

        list.display();   // to display all the nodes        
        System.out.println("The size of the list is: " +list.size());   //calling to print the size of the list
        
        System.out.println(list.find(12)); //  calling find to check value present in any node or not
        System.out.println(list.find(121)); //  calling find to check value present in any node or not

        System.out.println();
        
        System.out.print(list.deletefirst()+ " is the 1st node\nNow the linked list is:  ");
        list.display();   // to display the nodes after deleting 1st node
        System.out.println("Size after deletion of 1st node: " +list.size());   //calling to print the size of the list after deletion first node
        
        System.out.println();
        
        System.out.print(list.deletelast()+ " is the last node\nNow the linked list is:  ");
        list.display();   // to display the nodes after deleting last node
        System.out.println("Size after deletion of last node: " +list.size());   //calling to print the size of the list after deletion last node
        
        System.out.println();
        
        System.out.print(list.deleteAtindex(2)+ " is the node at the given index\nNow the linked list is:  ");
        list.display();   // to display the deleted nodes after deleting given index node
        System.out.println("Size after deleting the node: " +list.size());   //calling to print the size of the list after deletion last node
        
    }
}

class LL {
    private Node head;
    private Node tail;
    private int size;

    // initializing the size 0
    public LL() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        @Override   // when object get printed it will converted to its actual value
        public String toString() {
            return "Node{value=" + value + "} found";
        }
    }

    //                                                                              to insert the node at first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size ++;
    }

    // -------------------------------------------

    //                                                                              to insert the node at last
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // -------------------------------------------
    
    //                                                                              to insert node at any index
    public void insertAtIndex(int index, int val) {
        if (index == size) {
            insertLast(val);
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // -------------------------------------------
    
    //                                                                              Delete the first node
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // -------------------------------------------
    
    //                                                                              to delete the last node
    public int deletelast(){
        if (head == null) {
            System.out.println("List is empty.");
        }
        if (head.next == null) {
            // Only one node
            head = tail = null;
            int val = tail.value;
        }
        if(size<=1){
            return deletefirst();
        }
        Node Last2nd = get(size-2);
        int val = tail.value;
        tail = Last2nd;
        tail.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 1; i<=index; i++){
            temp = temp.next;
        }
        return temp;
    }
    
    // -------------------------------------------
    
    //                                                                              to delete node at any index
    public int deleteAtindex(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return val;
    }

    // -------------------------------------------
    
    //                                                              to find whether the value is present in the index or not?
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // -------------------------------------------
    
    //                                                                              To return the size of the list
    public int size() {
        return size;
    }

    // -------------------------------------------
    
    //                                                                              to print all the nodes
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
