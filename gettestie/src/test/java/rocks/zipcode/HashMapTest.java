package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    public void hashMapTest(){
        //given
        HashMap<Integer, String> hashMap = new HashMap<>();
        //when
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        boolean assertion = hashMap.containsKey(2);
        //then
        Assert.assertTrue(assertion);
    }

    @Test
    public void hashMapTest2(){
        //given
        HashMap<Integer, String> hashMap = new HashMap<>();
        //when
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        boolean assertion = hashMap.containsKey(4);
        //then
        Assert.assertFalse(assertion);
    }
}
