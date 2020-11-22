package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void linkedListTest(){
        //given
        LinkedList<String> linkedList = new LinkedList<>();
        String expected = "sad";
        //when
        linkedList.add("happy");
        linkedList.add("sad");
        linkedList.add("confused");
        linkedList.add("silly");
        linkedList.pop();
        String actual = linkedList.getFirst();
        //then
        Assert.assertEquals(expected, actual);

    }
}
