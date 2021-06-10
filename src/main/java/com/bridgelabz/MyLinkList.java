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

    public void addAtLast(MyNode newNode) {
        if(start == null) {
            start = newNode;
        }
        if (last == null){
            last =newNode;
        }
        else{
            this.last.setNext(newNode);
            this.last = newNode;
        }
    }
    public void addAtSelectedPosition(MyNode<T> mySelectedNode, MyNode<T> newNode) {
        MyNode<T> tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
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

    public boolean findNode(T key) {
        MyNode temp = start;
        boolean found = true;
        System.out.println(temp);
        while (temp != null && temp.getNext() != null) {
            if (temp.getKey() == key) {
                found = true;
            }
            else {
                temp = temp.getNext();
            }
        }
        return found;
    }

    public void addAfterSearchedPosition(MyNode mySelectedNode, MyNode newNode)
    {
        MyNode tempNode = this.start;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = tempNode.getNext();
        }

        newNode.setNext(tempNode.getNext().getNext());
        tempNode.setNext(newNode);
    }

    public void printMyNode() {
        System.out.println("My nodes" +start);
        System.out.println("Size of linked list" +size);
    }
}
