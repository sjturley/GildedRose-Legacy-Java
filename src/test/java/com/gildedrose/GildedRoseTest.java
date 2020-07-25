package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void approveGildedRose() {
        String response = updateQuality();
        Approvals.verify(response);
    }

    private String updateQuality() {
        GildedRose gildedRose = new GildedRose() {
            @Override
            public Item[] getItems() {
                return new Item[]{new Item("my item", 0, 0)};
            }
        };
        gildedRose.updateQuality();

        return Arrays.toString(gildedRose.items);
    }
}
