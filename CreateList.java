package com.company;

public class CreateList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void printList(){
        Node n= head;
        while (n != null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        CreateList list = new CreateList();
        list.head=new Node(1);
        Node second=new Node(3);
        Node third = new Node(9);
        list.head.next=second;
        second.next=third;
        list.printList();
    }
}
