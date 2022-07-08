package com.sparta.ah;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RaindropsTest
{
    @DisplayName("Basic functionality tests")
    @Nested
    class FunctionalityTests {

        @Test
        @DisplayName("Check jUnit is setup correctly")
        void checkTestSetup() {
            Assertions.assertEquals(1, 1);
        }

        @Test
        @DisplayName("Check number with factor of 3 returns 'Pling'")
        void checkThreeReturnsPling() {
            Assertions.assertEquals("Pling", Raindrops.getRaindrops(3));
        }

        @Test
        @DisplayName("Check number with factor of 5 returns Plang")
        void checkFiveReturnsPlang() {
            Assertions.assertEquals("Plang", Raindrops.getRaindrops(5));
        }

        @Test
        @DisplayName("Check 7 returns Plong")
        void checkSevenReturnsPlong() {
            Assertions.assertEquals("Plong", Raindrops.getRaindrops(7));
        }

        @Test
        @DisplayName("Check Product of Three And Five returns PlingPlang")
        void checkProductOfThreeAndFiveReturnsPlingPlang() {
            int product = 3 * 5;
            Assertions.assertEquals("PlingPlang", Raindrops.getRaindrops(product));
        }

        @Test
        @DisplayName("Check Product of Five and Seven returns PlingPlang")
        void checkProductOfFiveAndSevenReturnsPlangPlong() {
            int product = 5 * 7;
            Assertions.assertEquals("PlangPlong", Raindrops.getRaindrops(product));
        }

        @Test
        @DisplayName("Check that minus three returns 'Pling'")
        void checkMinusThreeReturnsPling() {
            Assertions.assertEquals("Pling", Raindrops.getRaindrops(-3));
        }

        @Test
        @DisplayName("Check that one negative factor returns same String as positive")
        void checkMinusFactorReturnsNegativeProduct() {
            int product = -5 * 7;
            Assertions.assertEquals("PlangPlong", Raindrops.getRaindrops(product));
        }

        @Test
        @DisplayName("Check that two negative factors return same String as positive")
        void checkTwoNegativeFactorsReturnPositiveProduct() {
            int product = -5 * -7;
            Assertions.assertEquals("PlangPlong", Raindrops.getRaindrops(product));
        }


    }

    @DisplayName("Boundary tests")
    @Nested
    class BoundaryTests {
        @Test
        @DisplayName("Check input of zero returns '0'")
        void checkInputOfZero() {
            Assertions.assertEquals("0", Raindrops.getRaindrops(0));
        }

        @Test
        @DisplayName("Check input of one returns '1'")
        void checkInputOfOne() {
            Assertions.assertEquals("1", Raindrops.getRaindrops(1));
        }

        @Test
        @DisplayName("Check input of max integer")
        void checkInputOfMaxInteger() {
            Assertions.assertEquals("2147483647", Raindrops.getRaindrops(Integer.MAX_VALUE));
        }

        @Test
        @DisplayName("Check input of max integer")
        void checkInputOfMinInteger() {
            Assertions.assertEquals("-2147483648", Raindrops.getRaindrops(Integer.MIN_VALUE));
        }


    }
}
