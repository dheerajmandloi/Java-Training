package Stack;

public class Demo {
    static  class Node{
        int data;
        Node next;
        Node(int val)
        {
            this.data=val;
            this.next=null; 
        }
    }
    static Node top=null;

    static void push(int val)
    {
        Node newNode=new Node(val);
        if(top==null)
        {
        newNode.next=top;
        top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
    }

    static int pop()
    {
        if(top==null)
        {
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
    }

    static int peek()
    {
        if(top==null)
        {
            return -1;
        }
        return top.data;
    }
    static void display()
    {
        if(top==null)
        {
            return;
        }
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    static void reverse()
{
    Node prev = null;
    Node curr = top;
    Node next = null;

    while(curr != null)
    {
        next = curr.next;   // Next node save karo
        curr.next = prev;   // Link reverse karo
        prev = curr;        // Prev ko aage badhao
        curr = next;        // Curr ko next par le jao
    }

    top = prev;             // Naya top
}

static boolean contains(int val)
{
    if(top==null)
    {
        return false;
    }
    Node temp=top;
    while(temp!=null)
    {
        if(temp.data==val)
        {
            return true;
        }
        temp=temp.next;
    }
    return false;
}

static Node merge(Node s1, Node s2)
{
    if(s1 == null) return s2;
    if(s2 == null) return s1;

    Node temp = s1;

    while(temp.next != null)
    {
        temp = temp.next;
    }

    temp.next = s2;

    return s1;
}
  static void middle(Node head)
{
    if(head == null)
    {
        System.out.println("Stack is Empty");
        return;
    }

    Node slow = head;
    Node fast = head;
    Node prev = null;

    while(fast != null && fast.next != null)
    {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // Odd number of nodes
    if(fast != null)
    {
        System.out.println("Middle Element = " + slow.data);
    }
    // Even number of nodes
    else
    {
        double avg = (prev.data + slow.data) / 2.0;
        System.out.println("Average of Middle Elements = " + avg);
    }
}

    public static void main(String[] args) 
    {
      
      push(1);
      push(2);
      push(3);
      push(4);
      push(5);
    
     display();
     System.out.println();
    //   peek();

    //   System.out.println();

    //   display();

    //   System.out.println();

    //   reverse();
    //   display();

      middle(top);
    }
}

//LIFO : Last In First Out
//insertion or deletion are cover in O(1)
//Stack is the ADT (Abstract Data Structure)
//Stack is a linear data structure
//it is implemented using array or linked list or collection framework


//merge two stacks
//contains
//add two stacks


///Find the next greatest element in the array of size n 
/// input : {2,1,5,9,7,10}