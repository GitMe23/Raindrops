package com.sparta.ah;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for RaindropsApp
 */
public class RaindropsAppTest
{

    @Test
    @DisplayName("Check jUnit is setup correctly")
    void checkTestSetup() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Check number with factor of 3 returns 'Pling'")
    void checkThreeReturnsPling() {
        Assertions.assertEquals("Pling", RaindropsApp.getRaindrops(3));
    }

    @Test
    @DisplayName("Check number with factor of 5 returns Plang")
    void checkFiveReturnsPlang() {
        Assertions.assertEquals("Plang", RaindropsApp.getRaindrops(5));
    }

    @Test
    @DisplayName("Check 7 returns Plong")
    void checkSevenReturnsPlong()
    {
        Assertions.assertEquals("Plong", RaindropsApp.getRaindrops(7) );
    }

    @Test
    @DisplayName("Check Product of Three And Five returns PlingPlang")
    void checkProductOfThreeAndFiveReturnsPlingPlang() {
        int product = 3 * 5;
        Assertions.assertEquals("PlingPlang", RaindropsApp.getRaindrops(product));
    }


    @Test
    @DisplayName("Check number with factor of 7 returns 'Plong'")
    void checkFourteenReturnsPlong()
    {
        Assertions.assertEquals("Plong", RaindropsApp.getRaindrops(14));
    }

    @Test
    @DisplayName("Check Product of Three And Five returns PlingPlang")
    void checkProductOfFiveAndSevenReturnsPlangPlong() {
        int product = 5 * 7;
        Assertions.assertEquals("PlangPlong", RaindropsApp.getRaindrops(product));
    }
}
