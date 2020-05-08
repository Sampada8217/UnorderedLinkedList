package com.UnorderedLinkedList;

    class Node<E extends Comparable<E> >{
        E data;
        Node next;
        Node(E data){
            this.data=data;
            this.next=null;

        }
        @Override
        public String toString(){
            return (String) this.data;
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

        public static<E extends Comparable<E> > E add(E data) {
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
            return data;
        }
        public static <E extends Comparable<E> > E remove(E data){
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
            int size=0;
            Node current=head;
            while(current!=null){
                size++;
                current=current.next;
            }
            return size;
        }

        public <E extends Comparable<E> > boolean search(E data) {

            Node current=head;
            int count=1;
            if(data==current.data){
                return true;
            }
            while(current!=null && current.data!=data) {
                current = current.next;
                count++;
            }
                return true;
            }


        }



