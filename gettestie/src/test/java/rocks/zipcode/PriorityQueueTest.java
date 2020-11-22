package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void priorityQueueTest(){
        //given
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        String expected1 = "Turkey";
        String expected2 = null;
        //when
        priorityQueue.add("Turkey");
        String actual1 = priorityQueue.poll();
        String actual2 = priorityQueue.peek();
        //then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
