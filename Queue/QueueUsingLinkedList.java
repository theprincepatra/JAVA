package Queue;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null; // same as front
        Node tail = null; // same as rear
        int size = 0;

        // Check if queue is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Add to tail (enqueue)
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Remove from head (dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return result;
        }

        // Peek at head
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        // Get current size
        public int getSize() {
            return size;
        }

        // Display queue
        public void display() {
            Node temp = head;
            
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Queue size: " + q.getSize());
        q.display();

        System.out.println("Peek: " + q.peek());

        q.remove();
        System.out.println("After removing one element:");
        q.display();
        System.out.println("Queue size: " + q.getSize());

        while (q.isEmpty()) {
                System.out.print(q.peek());
                q.remove();
            }
            System.out.println();
    }
}
