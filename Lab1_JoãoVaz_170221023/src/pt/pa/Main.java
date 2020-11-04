package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueException;
import pt.pa.adts.QueueLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>(5);
        try{
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.front());
            queue.enqueue(5);
            System.out.println(queue.dequeue());
            System.out.println(queue.front());
        }catch (QueueException qe){ System.out.println(qe.getMessage());}
    }
}
