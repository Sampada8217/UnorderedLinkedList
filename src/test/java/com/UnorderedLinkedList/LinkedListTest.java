package com.UnorderedLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testEmptyLinkedList() {
        LinkedList linkedList=new LinkedList();
        Node head= LinkedList.list();
        Assert.assertEquals(null,head);

    }

    @Test
    public void testAddItem() {
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Assert.assertEquals(4,linkedList.size());
    }

    @Test
    public void testRemoveItem() {
        LinkedList linkedList=new LinkedList();
        linkedList.remove(4);
        Assert.assertEquals(3, linkedList.size());

    }

    @Test
    public void testSearchItem() {
        LinkedList linkedList=new LinkedList();
        Assert.assertTrue(linkedList.search(1));

    }
    @Test
    public void testIsEmpty(){
        LinkedList linkedList=new LinkedList();
        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void testAppend() {
        LinkedList linkedList=new LinkedList();
        linkedList.append(5);
        Assert.assertEquals(3,linkedList.size());
    }

    @Test
    public void testIndex() {
        LinkedList linkedList=new LinkedList();
        Assert.assertEquals(5,linkedList.findIndex(5));

    }
}

