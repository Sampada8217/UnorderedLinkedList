package com.UnorderedLinkedList;

    class Node<E extends Comparable<E> >{
        E data;
        Node next;
        Node(E data){
            this.data=data;
            this.next=null;

        }
    }
    public class LinkedList<E extends Comparable<E> > {
        public static Node head=null;
        public static Node tail=null;

        public static <E extends Comparable<E> > Node list(){

            if(head==null){
                head=null;
                tail=null;
            }
            return null;
        }
    }


