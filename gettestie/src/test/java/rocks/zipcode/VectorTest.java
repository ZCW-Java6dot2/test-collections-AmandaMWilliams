package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    @Test
    public void vectorTest(){
        //given
        Vector<String> vector = new Vector();
        String expected = "fruit";
        //when
        vector.add("cake");
        vector.add("fruit");
        vector.add("meats");
        vector.add("some other food");
        String actual = vector.elementAt(1);
        //then
        Assert.assertEquals(expected, actual);

    }
}
