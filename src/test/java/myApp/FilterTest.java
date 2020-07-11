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
    public void ifOneSymbolGroupMaker() {
        Assert.assertArrayEquals(new String[]{"", "A"}, testFilter.groupMaker("A"));
    }

    @Test
    public void differenceBetweenSumOfValue() {
        Assert.assertEquals(20, testFilter.differenceBetweenSumsOfValue("PD", "SU"));
    }

    @Test
    public void ifOneSymbolDifferenceBetweenSumOfValue() {
        Assert.assertEquals(65, testFilter.differenceBetweenSumsOfValue("A", ""));
    }

}