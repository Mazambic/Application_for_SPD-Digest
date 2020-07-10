package myApp;

import org.junit.Assert;
import org.junit.Test;


public class FilterTest {

    Filter testFilter = new Filter();


    @Test
    public void notSameCharFilter() {
        Assert.assertNotEquals("aaAAppPP", testFilter.charFilter("aaAAppPP"));
    }

    @Test
    public void charFilter() {
        Assert.assertEquals("AP", testFilter.charFilter("aaAAppPP"));
    }

    @Test
    public void groupMaker() {
        Assert.assertArrayEquals(new String[]{"P", "A"}, testFilter.groupMaker("AP"));
    }

    @Test
    public void differenceOfSumOfValue() {
        Assert.assertEquals(20, testFilter.differenceOfSumOfValue("PD", "SU"));
    }

}