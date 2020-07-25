package com.gildedrose;

import org.junit.Test;

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
    }
}
