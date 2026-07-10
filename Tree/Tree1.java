// Traversal: 2 types
// 1. BFS
// 2. DFS
//
// DFS:
// 1. Preorder  = NLR
// 2. Inorder   = LNR
// 3. Postorder = LRN

package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree1 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static Node builtTree(Integer[] arr) {

        if (arr.length == 0 || arr[0] == null) {
            return null;
        }

        Queue<Node> que = new LinkedList<>();

        Node root = new Node(arr[0]);
        que.offer(root);

        int j = 1;

        while (j < arr.length && !que.isEmpty()) {

            Node curr = que.poll();

            // Left child
            if (j < arr.length && arr[j] != null) {
                curr.left = new Node(arr[j]);
                que.offer(curr.left);
            }

            j++;

            // Right child
            if (j < arr.length && arr[j] != null) {
                curr.right = new Node(arr[j]);
                que.offer(curr.right);
            }

            j++;
        }

        return root;
    }

    static boolean isSymmetric(Node root1, Node root2) {

        // Dono null hain
        if (root1 == null && root2 == null) {
            return true;
        }

        // Ek null hai aur dusra nahi
        if (root1 == null || root2 == null) {
            return false;
        }

        // Data same nahi hai
        if (root1.data != root2.data) {
            return false;
        }

        // Mirror comparison
        return isSymmetric(root1.left, root2.right)
                && isSymmetric(root1.right, root2.left);
    }

    static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);

        System.out.print(root.data + " ");

        inOrder(root.right);
    }

    static void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data + " ");
    }

    static void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {

            Node curr = que.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                que.offer(curr.left);
            }

            if (curr.right != null) {
                que.offer(curr.right);
            }
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 2, 3, 4, 4, 3 };

        Node root = builtTree(arr);

        System.out.println("Level Order:");
        levelOrder(root);

        System.out.println("\nPreorder:");
        preOrder(root);

        System.out.println("\nInorder:");
        inOrder(root);

        System.out.println("\nPostorder:");
        postOrder(root);

        System.out.println("\nIs Symmetric:");

        if (root == null) {
            System.out.println(true);
        } else {
            System.out.println(isSymmetric(root.left, root.right));
        }
    }
}