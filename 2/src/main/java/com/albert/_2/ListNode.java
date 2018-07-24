package com.albert._2;

import lombok.Data;

@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
