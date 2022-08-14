package leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        // given
        int[] prices = {7, 1, 5, 3, 6, 4};

        // when
        int result = new BestTimeToBuyAndSellStock().maxProfit(prices);

        // then
        assertEquals(5, result);
    }

    @Test
    void test2() {
        // given
        int[] prices = {7, 6, 4, 3, 1};

        // when
        int result = new BestTimeToBuyAndSellStock().maxProfit(prices);

        // then
        assertEquals(0, result);
    }
}