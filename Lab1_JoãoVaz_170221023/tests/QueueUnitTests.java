import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import pt.pa.adts.Queue;
import pt.pa.adts.QueueException;
import pt.pa.adts.QueueLinkedList;

public class QueueUnitTests {
    Queue<Integer> queue;

    @Before
    public void init(){
        queue = new QueueLinkedList<>(5);
    }

    @Test
    public void TestEnqueue(){
        try{
            queue.enqueue(1);
            int res = queue.front();
            Assert.assertEquals(1, res);
        } catch (QueueException qe){System.out.println(qe.getMessage());}
    }

    @Test
    public void TestDequeue(){
        try{
            queue.enqueue(1);
            int res = queue.dequeue();
            Assert.assertEquals(1, res);
        } catch (QueueException qe){System.out.println(qe.getMessage());}
    }

    @Test(expected = QueueException.class)
    public void TestDequeueError() throws QueueException{
        int res = queue.dequeue();
    }

    @Test(expected = QueueException.class)
    public void TestFrontError() throws QueueException{
        int res = queue.front();
    }

    @Test(expected = QueueException.class)
    public void TestEnqueueError() throws QueueException{
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
    }

    @Test
    public void TestSize()throws QueueException{
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Assert.assertEquals(3, queue.size());
    }

    @Test
    public void TestIsEmpty(){
        Assert.assertTrue("true", queue.isEmplty());
    }

    @Test
    public void TestIsNotEmpty()throws QueueException{
        queue.enqueue(1);
        Assert.assertFalse("false", queue.isEmplty());
    }
}