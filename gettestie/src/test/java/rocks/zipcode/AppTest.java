package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        //given
        String expected = "Hello World!";
        App app = new App();
        //when
        String actual = app.toString();
        //then
        Assert.assertEquals(expected, actual);
    }
}
