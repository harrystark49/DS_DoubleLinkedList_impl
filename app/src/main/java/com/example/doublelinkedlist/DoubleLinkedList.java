package com.example.doublelinkedlist;

import android.util.Log;

public class DoubleLinkedList<T> {
    Node head;

    class Node<T>{
        T data;
        Node prev;
        Node next;

         Node(T data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    void insert(T data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }

    void print(){
        Node temp=head;
        if(temp!=null){
            while (temp.next!=null){
                Log.d("doubleLinkedList",String.valueOf(temp.data));
                temp=temp.next;
            }
            Log.d("doubleLinkedList",String.valueOf(temp.data));
        }
    }

    void delete(){
        Node temp=head;
        if(temp!=null){
            while (temp.next!=null){
                temp=temp.next;
                if(temp.next.next==null){
                    temp.next=null;
                    break;
                }
            }
        }
    }
}
