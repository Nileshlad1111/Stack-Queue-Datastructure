package com.bridgelabz;

public class MyLinkList <T> {
    public MyNode last;
    public MyNode start;
    int size = 0;

    public MyLinkList() {
        this.start = null;
        this.last = null;
    }

    public void addAtStart(MyNode newNode) {
        if(last == null) {
            last = newNode;
        }
        if(start == null){
            start = newNode;
        }
        else {
            MyNode temp = start;
            this.start = newNode;
            this.start.setNext(temp);
        }
    }

    public MyNode RemoveAtStart() {
        MyNode temp = this.start;
        this.start = start.getNext();
        return temp;
    }

    public MyNode RemoveAtLast() {

        MyNode temp = start;
        while (!temp.getNext().equals(last))
        {
            temp = temp.getNext();
        }
        this.last = temp;
        temp = temp.getNext();
        return temp;
    }

    public void printMyNode() {
        System.out.println("My nodes" +start);
        System.out.println("Size of linked list" +size);
    }
}
