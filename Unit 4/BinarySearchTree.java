public class BinarySearchTree {
    static class Node {
        Node left;
        int value;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public static Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            // Node to delete found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node has two children
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.value);
        }

        return root;
    }

    public static int minValue(Node root) {
        int minv = root.value;
        while (root.left != null) {
            minv = root.left.value;
            root = root.left;
        }
        System.out.println("Min = " + minv);
        return minv;
    }

    public static void maxValue(Node root) {
        int maxv = root.value;
        while (root.right != null) {
            maxv = root.right.value;
            root = root.right;
        }
        System.out.println("Max = " + maxv);
    }

    public static int element(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + element(root.left) + element(root.right);
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return Math.max(1 + height(root.left), 1 + height(root.right));
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return (root.value + sum(root.left) + sum(root.right));
    }

    public static void nthLevel(Node root, int n) {
        if(root == null)
            return;
        if(n == 1)
            System.out.print(root.value +" ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
}

    public static void main(String[] args) {
        int[] elements = {23, 45, 12, 21, 5, 67, 89, 79, 1, 6};
        Node root = null;

        for(int value : elements){
            root = insertNode(root, value);
        }
        /*System.out.println("InOrder");
        inOrder(root);
        System.out.println("\nPreOrder");
        preOrder(root);
        System.out.println("\nPostOrder");
        postOrder(root);

        System.out.println("\nDeleting node with value 3");
        root = deleteNode(root, 5);

        System.out.println("\nIn order after deletion");
        inOrder(root);
        maxValue(root);
        minValue(root);*/
        //System.out.println(height(root));
        //System.out.println(sum(root));
        nthLevel(root, 4);
    }
}
