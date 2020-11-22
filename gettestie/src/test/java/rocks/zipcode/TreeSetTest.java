package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void treeSetTest(){
        //given
        TreeSet<String> treeSet = new TreeSet<>();
        Integer expected = 3;
        //when
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Carrot");
        treeSet.add("Carrot");
        Integer actual = treeSet.size();
        //then
        Assert.assertEquals(expected, actual);
    }
}
