package com.bridgelabz;

public class MyStack {
    private final MyLinkList linkList;

    public MyStack() {
        this.linkList = new MyLinkList();
    }

    public void push(MyNode myNode) {
        linkList.addAtStart(myNode);
    }

    public void printStack() {
        linkList.printMyNode();
    }

    public MyNode peak() {
        return linkList.start;
    }

    public MyNode pop() {
        return linkList.RemoveAtStart();
    }
}
