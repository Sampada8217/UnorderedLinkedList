package com.UnorderedLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testEmptyLinkedList() {
        LinkedList linkedList=new LinkedList();
        Node head=linkedList.list();
        Assert.assertEquals(null,head);

    }

    @Test
    public void testAddItem() {
        LinkedList linkedList=new LinkedList();
        Comparable head =linkedList.add(1);
        Assert.assertEquals(1,head);
    }
}

