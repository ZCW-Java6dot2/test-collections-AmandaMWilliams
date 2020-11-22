package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class IteratorTest {
    @Test
    public void iteratorTest(){
        //given
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer expected = 3;
        //when
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        Integer actual = arrayList.lastIndexOf(5);
        //then
        Assert.assertEquals(expected, actual);
    }
}
