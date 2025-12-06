public class usingLL {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static class LLStack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            int top = head.value;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.value;
        }
    }

    public static void main(String args[]) {
        LLStack.push(1);
        LLStack.push(2);
        LLStack.push(3);
        LLStack.push(4);

        while (!LLStack.isEmpty()) {
            System.out.println(LLStack.peek());
            LLStack.pop();
        }
        System.out.println(LLStack.peek());
    }
}
