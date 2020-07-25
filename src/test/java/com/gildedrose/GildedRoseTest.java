package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void approveGildedRose() {
        GildedRose gildedRose = new GildedRose() {
            @Override
            public Item[] getItems() {
                return new Item[]{new Item("my item", 0, 0)};
            }
        };
        gildedRose.updateQuality();

        Approvals.verify(Arrays.toString(gildedRose.items));
    }
}
