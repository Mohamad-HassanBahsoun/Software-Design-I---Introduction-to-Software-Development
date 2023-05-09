package AlgorithmsPt1.Stacks_Queues_UF;

public class Stack {

    private class Node{
        int item;
        Node next;
    }
    Node first = null;

    public void push(int x){
        // Here we create a new Node that will represent the item we are adding onto the stack
        Node temp = new Node();
        temp.item = x;

        // Then we check if the stack is empty
        if(first == null){
            // if empty we make the first item on the stack the item we added as it is the first item
            first = temp;
        }else{
            // if it is not empty we hold on to a reference of the first item, then we make the first the new item added
            // then that items next node is the old first.
            Node hold = first;
            first = temp;
            first.next = hold;
        }
    }

    public int pop(){
        // Here we keep a ref to the item we are popping so we can return it
        // then we just say that the first item (ie the top of the stack) is the next item. could be null or another node.
        int item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public int size(){
        int count = 0;
        Node temp = first;

        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
    }
}
