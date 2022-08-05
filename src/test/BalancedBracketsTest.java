package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //assertTrue tests
    @Test
    public void emptyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test2]"));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test3]]"));
    }

    @Test
    public void nestedBracketsSiblings() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test] [4]]"));
    }

    @Test
    public void nestedBracketsCousins() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[te[st 5]] [TEST[ 5]]]"));
    }

    @Test
    public void emptyNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[]]]"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("now what?"));
    }

    //assertFalse tests

    @Test
    public void leftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void rightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test 10["));
    }

    @Test
    public void moreLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test [11 [] "));
    }

    @Test
    public void moreRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test] 12] ]"));
    }


}
