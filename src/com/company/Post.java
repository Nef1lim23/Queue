package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public final class Post {
    private Post() { }
    public static void main(final String[] args) {
        final int lengthQueue = 10;
        final int[] mas = {20, 10, 15, 67, 66, 33, 17, 28};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override public int compare(final Integer o1, final Integer o2) {
                final int yearOld = 65;
                if (o2 < yearOld && o1 >= yearOld) {
                    return -1;
                } else {
                    return 1;
                }
            } };
        Queue<Integer> mailQueue = new PriorityQueue<>(lengthQueue, comparator);
        for (int i = 0; i < mas.length; i++) {
            mailQueue.add(mas[i]);
        }
        while (!mailQueue.isEmpty()) {
            System.out.println(mailQueue.remove());
        }
    }
}