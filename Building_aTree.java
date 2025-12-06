class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    static int index = -1;
    public static Node buildTree(int[] preorder) {
        index++;
        if (index >= preorder.length || preorder[index] == -1) {
            return null;
        }

        Node newNode = new Node(preorder[index]);
        newNode.left = buildTree(preorder);
        newNode.right = buildTree(preorder);

        return newNode;
    }
}

public class Building_aTree {
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, -1, -1, -1, 5, -1, -1};

        Node root = BinaryTree.buildTree(preorder);

        System.out.println("Root: " + root.value);

        if (root.left != null)
            System.out.println("Left Child: " + root.left.value);
        else
            System.out.println("Left Child: null");

        if (root.right != null)
            System.out.println("Right Child: " + root.right.value);
        else
            System.out.println("Right Child: null");
    }
}
