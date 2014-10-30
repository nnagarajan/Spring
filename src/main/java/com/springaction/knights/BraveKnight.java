package com.springaction.knights;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    @Override
    public void embarkOnquest() {
            quest.ebark();
    }
}
