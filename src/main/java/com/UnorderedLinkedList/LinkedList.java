package com.UnorderedLinkedList;

import java.io.IOException;

class Node<E extends Comparable<E> >{
        E data;
        Node next;
        Node(E data){
            this.data=data;
            this.next=null;

        }
        @Override
        public String toString(){

            return "LinkedList [data=" +data;
        }
    }
    public class LinkedList<E extends Comparable<E> > {
        public static Node head=null;
        public static Node tail=null;
        E data;
       public LinkedList(E data){
            this.data=data;
        }

        public LinkedList() {

        }

        public  <E extends Comparable<E> > Node list(){

            if(head==null){
                head=null;
                tail=null;
            }
            return null;
        }

        public <E extends Comparable<E> > E add(E data) {
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
            return data;
        }
        public <E extends Comparable<E> > E remove(E data){
            Node current=head;
            Node temp=null;
         if(data==current.data){
           current=current.next;

         }
            while(current!=null && current.data!=data){
                temp=current;
                current=current.next;
            }
            temp.next=current.next;

            return data;
        }

        public <E extends Comparable<E> >  int size() {
            Node current=head;
            int size=0;
            while(current!=null){
                size++;
                current=current.next;
            }
            return size;
        }

        public <E extends Comparable<E> > boolean search(E data) {
           try {
               Node current = head;
               int count = 1;
               if (data == current.data) {
                   return true;
               }
               while (current != null && current.data != data) {
                   current = current.next;
                   count++;
               }
           }catch (NullPointerException e){
               e.printStackTrace();
           }
                return true;
       }


        public boolean isEmpty() {
            return head==null;
        }

        public  <E extends Comparable<E> > E append(E data) {
            add(data);

            return data;
            }


        public <E extends Comparable<E> >int findIndex(E data) {
            int index=1;
            Node current=head;
            if(data==current.data){
                return index;
            }
            while(current!=null && current.data!=data){
                current=current.next;
                index++;
            }
            return index;
        }

        public  <E extends Comparable<E> > int insert(E data, int pos) {
            try {
                Node newNode = new Node(data);
                Node previous = head;
                int count = 1;
                while (count < pos - 1) {
                    previous = previous.next;
                    count++;
                }
                Node current = previous.next;
                newNode.next = current;
                previous.next = newNode;

            }catch (NullPointerException e)  {

                e.printStackTrace();
            }
            return pos;
        }

    }



