package com.bridgelabz;

public class MyQueue {
    private final MyLinkList linkList;
    public MyQueue() {
        this.linkList = new MyLinkList();
    }
    public void enqueue(MyNode newNode) {
        linkList.addAtStart(newNode);
    }
    public MyNode peek() {
        return linkList.last;
    }

    public MyNode dequeue() {
        return linkList.RemoveAtLast();
    }
}
