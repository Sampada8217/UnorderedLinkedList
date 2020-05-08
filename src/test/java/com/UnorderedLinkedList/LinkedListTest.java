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
        Comparable ele = linkedList.add(1);
        Assert.assertEquals(1,ele);
    }
    @Test
    public void testAddItem1(){
        LinkedList linkedList=new LinkedList();
        Comparable ele= linkedList.add(2);
        Assert.assertEquals(2,ele);
    }

    @Test
   public void testAddItem2(){
        LinkedList linkedList=new LinkedList();
        Comparable ele= linkedList.add(3);
        Assert.assertEquals(3,ele);
    }

    @Test
    public void testRemoveItem() {
        LinkedList linkedList=new LinkedList();
        linkedList.remove(2);
        Assert.assertEquals(2, linkedList.size());

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
        linkedList.append(4);
        Assert.assertEquals(3,linkedList.size());
    }
}

