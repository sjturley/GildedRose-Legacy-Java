package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void approveGildedRose() {
        String response = updateQuality("my item", 0, 0);
        Approvals.verify(response);
    }

    private String updateQuality(String name, int sellIn, int quality) {
        GildedRose gildedRose = new GildedRose() {
            @Override
            public Item[] getItems() {
                return new Item[]{new Item(name, sellIn, quality)};
            }
        };
        gildedRose.updateQuality();

        return Arrays.toString(gildedRose.items);
    }
}
