package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void stackTest(){
        //given
        Stack<Integer> stack = new Stack<>();
        //when
        boolean isStackEmpty = stack.empty();
        //then
        Assert.assertTrue(isStackEmpty);
    }

    @Test
    public void stackTest2(){
        //given
        Stack<Integer> stack = new Stack<>();
        Integer expected = 7;
        //when
        stack.push(1);
        stack.push(7);
        stack.push(45658);
        stack.pop();
        Integer actual = stack.peek();
        //then
        Assert.assertEquals(expected, actual);
    }
}
