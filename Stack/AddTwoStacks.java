package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoStacks {

    static Node top1 = null;
    static Node top2 = null;

    // Push in Stack 1
    static void push1(int data) {
        Node newNode = new Node(data);
        newNode.next = top1;
        top1 = newNode;
    }

    // Push in Stack 2
    static void push2(int data) {
        Node newNode = new Node(data);
        newNode.next = top2;
        top2 = newNode;
    }

    // Display Stack
    static void display(Node top) {
        while (top != null) {
            System.out.print(top.data + " ");
            top = top.next;
        }
        System.out.println();
    }

    // Add Stack2 to Stack1
    static void addStacks() {
        if (top1 == null) {
            top1 = top2;
            return;
        }

        Node temp = top1;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = top2;
    }

    public static void main(String[] args) {

        push1(3);
        push1(2);
        push1(1);

        push2(6);
        push2(5);
        push2(4);

        System.out.println("Stack 1:");
        display(top1);

        System.out.println("Stack 2:");
        display(top2);

        addStacks();

        System.out.println("After Adding:");
        display(top1);
    }
}