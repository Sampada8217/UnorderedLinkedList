package com.UnorderedLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void test() {
        LinkedList linkedList=new LinkedList();
        Node head=linkedList.list();
        Assert.assertEquals(null,head);

    }
}

