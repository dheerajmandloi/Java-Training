// Traversal: 2 types
// 1. BFS
// 2. DFS
//
// DFS:
// 1. Preorder  = NLR
// 2. Inorder   = LNR
// 3. Postorder = LRN

package Tree;

import java.util.*;

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

    // Build Tree
    static Node buildTree(Integer[] arr) {
        if (arr.length == 0)
            return null;
        Queue<Node> que = new LinkedList<>();
        Node root = new Node(arr[0]);
        que.offer(root);
        int j = 1;
        while (j != arr.length && !que.isEmpty()) {
            Node curr = que.poll();
            if (arr[j] != null) {
                curr.left = new Node(arr[j]);
                que.offer(curr.left);
            }
            if (arr[j + 1] != null) {
                curr.right = new Node(arr[j + 1]);
                que.offer(curr.right);
            }
            j += 2;
        }
        return root;
    }

    // Two trees are symmetric
    static boolean isSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        if (root1.data != root2.data)
            return false;

        return root1.data == root2.data && isSymmetric(root1.left, root2.left) && isSymmetric(root1.right, root2.right);
    }

    // Two trees are mirror images
    static boolean isMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        if (root1.data != root2.data)
            return false;

        return root1.data == root2.data && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);

    }

    static int pathSum(Node root, int sum) {
        if (root == null)
            return 0;
        if (root.data == sum)
            return 1;
        return pathSum(root.left, sum - root.data) + pathSum(root.right, sum - root.data);
    }

    // Pre-order traversal
    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-order traversal
    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Post-order traversal
    static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Level-order traversal
    static void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            Node curr = que.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null)
                que.offer(curr.left);
            if (curr.right != null)
                que.offer(curr.right);
        }
    }

    // Height
    static int height(Node root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    // Diameter
    static int d = 0;

    static int diameter(Node root) {
        if (root == null)
            return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);

        d = Math.max(d, left + right + 1);

        return Math.max(left, right) + 1;
    }

    // No.of Nodes
    static int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Sum of Nodes
    static int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    // Lowest Common Ancestors
    static Node LCA(int data1, int data2, Node root) {
        if (root == null)
            return null;

        if (root.data == data1 || root.data == data2)
            return root;

        Node left = LCA(data1, data2, root.left);
        Node right = LCA(data1, data2, root.right);

        if (left != null && right == null)
            return left;
        if (left == null && right != null)
            return right;

        if (left != null && right != null)
            return root;

        return null;

    }

    // Balance tree
    static boolean isBalance(Node root) {
        if (root == null)
            return true;

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1)
            return false;

        return isBalance(root.left) && isBalance(root.right);
    }

    // Binary Tree deletion
    static Node delete(Node root, int key) {
        if (root == null)
            return null;
        Node keyNode = null;
        Node curr = null;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            curr = que.poll();
            if (curr.data == key) {
                keyNode = curr;
            }
            if (curr.left != null)
                que.offer(curr.left);
            if (curr.right != null)
                que.offer(curr.right);
        }
        if (keyNode != null) {
            keyNode.data = curr.data;
            return deleteLeafNode(curr, root);
        }
        return root;
    }

    static Node deleteLeafNode(Node root, Node temp) {
        if (root == null)
            return null;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            Node curr = que.poll();
            if (curr.left == temp) {
                curr.left = null;
                break;
            } else if (curr.left != null) {
                que.offer(curr.left);
            }
            if (curr.right == temp) {
                curr.right = null;
                break;
            } else if (curr.right != null) {
                que.offer(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        /*
         * Node root = new Node(1);
         * root.left = new Node(2);
         * root.left.left = new Node(4);
         * root.left.right = new Node(5);
         * root.right = new Node(3);
         * root.right.left = new Node(6);
         * 
         * 
         * Node ans = LCA(4, 5, root);
         * System.out.println(ans.data);
         */

        Node root = buildTree(new Integer[] { 1, 7, 8, 2, null, 9, 10, 3, 4, null, null, 12, 11, 5, null });
        levelOrder(root);
        root = delete(root, 7);
        System.out.println();
        levelOrder(root);
        // System.out.println(isBalance(root));

        // Node ans = LCA(2, 4, root);
        // System.out.println(ans.data);
        /*
         * diameter(root);
         * System.out.println(d);
         * System.out.println(height(root));
         * 
         * preOrder(root);
         * System.out.println();
         * inOrder(root);
         * System.out.println();
         * postOrder(root);
         * System.out.println();
         * levelOrder(root);
         * 
         * 
         * Integer[] array = {1, 2, 3, 4, 5, 6, null};
         * Node root_node = buildTree(array);
         * System.out.println();
         * 
         * System.out.print("Preorder: ");
         * preOrder(root_node);
         * 
         * System.out.print("\nInorder: ");
         * inOrder(root_node);
         * 
         * System.out.print("\nPostorder: ");
         * postOrder(root_node);
         * 
         * System.out.print("\nLevel Order: ");
         * levelOrder(root_node);
         * 
         * System.out.println();
         * 
         * System.out.println("Tree is Symmetric: " +
         * isSymmetric(root.left, root.right));
         * 
         * System.out.println("Tree is mirror: " +
         * isMirror(root.left, root.right));
         * 
         * 
         * System.out.println(countNodes(root_node));
         * System.out.println(sumOfNodes(root_node));
         */

    }
}

// Write a program to perform :

// insertion
// deletion
// search
// level order
// preorder
// inorder
// postorder
// height
// diameter
// lowest common ancestor for a BST
// symmetric
// mirror
// count nodes
