package AlgorithmsPt1.Stacks_Queues_UF;

public class Queue {

    private class Node{
        int item;
        Node next;
    }
    Node first, last = null;

    public void enqueue(int x){
        Node temp = new Node();
        temp.item = x;

        if(last == null){
            first = temp;
            last = first;
        }else{
            Node hold = last;
            last = temp;
            hold.next = last;
        }
    }

    public int dequeue(){
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

        while(temp != null){
            count++;
            temp= temp.next;
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
        Queue queue = new Queue();
    }
}
