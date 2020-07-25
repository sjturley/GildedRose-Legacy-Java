package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void approveGildedRose() {
        String[] nameChoices = {"my item"};
        Integer[] sellInChoices = {0};
        Integer[] qualityChoices = {0};
        CombinationApprovals.verifyAllCombinations(this::updateQuality, nameChoices, sellInChoices, qualityChoices);
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
