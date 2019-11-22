package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_Class;
    @Before
    public void createBBObject() {BalancedBrackets test_Class = new BalancedBrackets();}

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //1
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test //2
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test //3
    public void onlyRightBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test //4
    public void noBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }

    @Test //5
    public void filledBalancecdBracketsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[filled]"));
    }

    @Test //6
    public void centeredBracketsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("out[in]out"));
    }

    @Test //7
    public void leftSideBracketsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]lefty"));
    }

    @Test //8
    public void rightSideBracketsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("righty[]"));
    }

    @Test //9
    public void leftInsideBracketOnlyReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("text[moreText"));
    }

    @Test //10
    public void rightInsideBracketOnlyReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("text]moreText"));
    }

    @Test //11
    public void spacesAndBracketsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("   []  "));
    }

    @Test //12
    public void multipleBracketSetsReturnTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[][][][][]"));
    }

}
