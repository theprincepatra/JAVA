import java.util.ArrayList;

public class PushatBottom {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.isEmpty();
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushAtBottom(data);
            push(top);
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);

        Stack.pushAtBottom(5);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
