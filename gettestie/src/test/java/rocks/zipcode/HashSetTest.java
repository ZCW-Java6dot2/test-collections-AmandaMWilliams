package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void hashSetTest(){
        //given
        HashSet<String> hashSet = new HashSet<>();
        Integer expectedSize = 4;
        //when
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Red");
        hashSet.add("Green");
        Integer actualSize = hashSet.size();
        //then
        Assert.assertNotEquals(expectedSize, actualSize);
    }

}
