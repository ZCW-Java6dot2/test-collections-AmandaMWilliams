package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void treeMapTest(){
        //given
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Integer expected = 4;
        //when
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Carrot");
        treeMap.put(4, "Carrot");
        Integer actual = treeMap.lastKey();
        //then
        Assert.assertEquals(expected, actual);
    }

}
