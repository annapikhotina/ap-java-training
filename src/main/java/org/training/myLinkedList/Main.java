package org.training.myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.addValue(4);
        list.addValue(5);

        System.out.println("Print original linked list object");
        list.printList();

        list.reverse();

        System.out.println("Print a new reversed linked list object");
        list.printList();
    }
}