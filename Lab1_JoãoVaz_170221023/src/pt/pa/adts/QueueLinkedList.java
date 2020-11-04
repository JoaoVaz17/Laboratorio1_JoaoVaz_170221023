package pt.pa.adts;

/**
 * Implementation of a Queue with LinkedList
 * All the methods have O(1) as algorithmic complexities
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;
    private int maxSize;

    public QueueLinkedList(int maxSize) {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.next = trailer;
        size=0;
        this.maxSize = maxSize;
    }

    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node prev, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void enqueue(T elem) throws QueueException{
        if(size == maxSize) {
            throw new QueueException("Tamanho máximo atingido");
        }
        Node aux = trailer.prev;
        Node newNode = new Node(elem, aux, trailer);
        aux.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    @Override
    public T dequeue()throws QueueException{
        if(size == 0){
            throw new QueueException("A lista esta vazia");
        }
        T elem = header.next.element;
        header.next.next.prev=header;
        header.next= header.next.next;
        size--;

        return elem;
    }

    @Override
    public T front() throws QueueException{
        if(size == 0){
            throw new QueueException("A lista esta vazia");
        }
        return header.next.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmplty(){
        return size == 0;
    }

    @Override
    public void clear() {
        header.next=trailer;
        trailer.prev=header;
        size=0;
    }
}
