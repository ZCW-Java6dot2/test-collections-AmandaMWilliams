package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    @Test
    public void arrayDequeTest(){
        //given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expected = "Cow";
        //when
        arrayDeque.add("Cow");
        arrayDeque.add("Sheep");
        arrayDeque.add("Horse");
        arrayDeque.add("Pig");
        String actual = arrayDeque.pop();
        //then
        Assert.assertEquals(expected, actual);
    }
}
