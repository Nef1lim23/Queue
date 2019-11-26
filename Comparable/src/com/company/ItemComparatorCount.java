package com.company;

import java.io.Serializable;
import java.util.Comparator;

class ItemComporatorCount implements Comparator<Item>, Serializable {
    @Override
    public int compare(final Item o1, final Item o2) {
        if (o2.getCount() < o1.getCount()) {
            return -1;
        } else if (o2.getCount() > o1.getCount()) {
            return 1;
        } else {
            return 0;
        }
    }
}