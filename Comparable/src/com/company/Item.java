package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public final class Item {
    private String name;
    private int count;
    public Item(final String name, final int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public static void main(final String[] args) {
        final int[] count = {100, 111};
        Comparator<Item> productComparator = new ItemComporatorCount().thenComparing(new ItemComparatorName());
        Set<Item> strings = new TreeSet<>(productComparator);
        strings.add(new Item("Рапира", count[0]));
        strings.add(new Item("Травела", count[0]));
        strings.add(new Item("Дагон", count[0]));
        strings.add(new Item("Бабочка", count[1]));
        for (Item s : strings) {
            System.out.println(s.getName() + " "  + s.getCount());
        }
    }

}