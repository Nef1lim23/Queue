package com.company;

import java.io.Serializable;
import java.util.Comparator;

class ItemComparatorName implements Comparator<Item>, Serializable {
    @Override
    public int compare(final Item o1, final Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}