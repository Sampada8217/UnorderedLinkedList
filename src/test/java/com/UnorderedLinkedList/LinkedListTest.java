package com.UnorderedLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void whenCreate_newLinkedList_shouldReturn_emptyList() {
        LinkedList linkedList=new LinkedList();
        Node head= linkedList.list();
        Assert.assertEquals(null,head);

    }

    @Test
    public void whenAddNewItem_shouldReturn_nothing() {
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Assert.assertEquals(4,linkedList.size());
    }


    @Test
    public void whenItem_Removed_fromLinkedList_shouldReturnData() {
        LinkedList linkedList=new LinkedList();
        Comparable data=linkedList.remove(4);
        Assert.assertEquals(4,data);
    }

    @Test
    public void whenSearchItem_fromLinkedList_shouldReturnsTrue() {
        LinkedList linkedList=new LinkedList();
        Assert.assertTrue(linkedList.search(1));

    }
    @Test
    public void whenLinkedList_IsNotEmpty_returnsFalse(){
        LinkedList linkedList=new LinkedList();
        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void whenLinkedList_addItemAtEnd_shouldReturnData() {
        LinkedList linkedList=new LinkedList();
        Assert.assertEquals(6,linkedList.append(6));
    }

    @Test
    public void whenCheckIndex_returns_positionOfData() {
        LinkedList linkedList=new LinkedList();
        Assert.assertEquals(2,linkedList.findIndex(2));

    }

   @Test
    public void whenAddNewItem_atSpecificPos_returnsPosWhereDataAdded() {
        LinkedList linkedList=new LinkedList();
        Comparable pos=linkedList.insert(8,6);
        Assert.assertEquals(6,pos);

    }

    @Test
    public void whenItemRemoved_shouldReturn_LastItem() {
        LinkedList linkedList=new LinkedList();


    }
}

