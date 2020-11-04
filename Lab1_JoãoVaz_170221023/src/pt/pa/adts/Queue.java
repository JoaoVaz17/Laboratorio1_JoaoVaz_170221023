package pt.pa.adts;

/**
 * Defines a queue data structure type
 *
 * @param <T> The queue element type
 */
public interface Queue<T> {

    //TODO: definir operações do ADT e documentá-las

    /**
     * Adds an element in the end of the queue
     * @param elem The element to enqueue
     * @throws QueueException if the queue is full
     */
    public void enqueue(T elem) throws QueueException;

    /**
     * Removes an element from the queue and returns its value
     * @return
     * @throws QueueException if the queue is empty
     */
    public T dequeue()throws QueueException;

    /**
     * Returns the first element in the queue
     * @return
     */
    public T front()throws QueueException;

    /**
     * Returns the size of the queue
     * @return
     */
    public int size();

    /**
     * Returns if the queue is empty or not
     * @return
     */
    public boolean isEmplty();

    /**
     * Empties the queue
     */
    public void clear();
}
