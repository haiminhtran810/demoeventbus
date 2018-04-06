package com.example.hcm_102_0006.demoeventbusandroid;

/**
 * Created by hcm-102-0006 on 06/04/2018.
 */

public class CustomEvent {
    private CustomItem mCustomItem;

    public CustomEvent(CustomItem customItem) {
        mCustomItem = customItem;
    }

    public CustomItem getCustomItem() {
        return mCustomItem;
    }

    public void setCustomItem(CustomItem customItem) {
        mCustomItem = customItem;
    }
}
