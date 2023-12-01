package org.training.myLinkedList;

public class MyLinkedList<T> {

    Node<T> head;

    static class Node<T> {
        Node<T> next;
        T value;

        Node(T value) {
            next = null;
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    void addValue(T value) {
        Node<T> node = new Node<>(value);

        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> lastNode = this.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    void printList() {
        Node<T> node = this.head;
        while (node != null) {
            System.out.printf("%s \n", node.value);
            node = node.next;
        }
    }

    void reverse() {
        Node<T> node = this.head;
        Node<T> prev = null;
        Node<T> current = node;
        Node<T> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        this.head = node;
    }
}
