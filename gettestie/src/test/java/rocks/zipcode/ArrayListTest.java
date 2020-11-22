package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void ArrayListTest(){
        //given
        ArrayList<String> arrayList = new ArrayList<>();
        String expected = "Fish";
        //when
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Fish");
        arrayList.add("Bird");
        String actual = arrayList.get(2);
        //then
        Assert.assertEquals(expected, actual);

    }
}
