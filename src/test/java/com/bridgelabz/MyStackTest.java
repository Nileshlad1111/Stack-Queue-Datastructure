package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void Provide3Number_WhenAddedToStackInSequence_TestCaseShouldPass(){
        MyStack myStack = new MyStack();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> threadNode = new MyNode<>(56);

        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(threadNode);

        MyNode peak = myStack.peak();
        myStack.printStack();

        Assert.assertEquals(threadNode, peak );
    }

    @Test
    public void Provide3Number_WhenAddedToStackNotInSequence_TestCaseShouldPass(){
        MyStack myStack = new MyStack();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> threadNode = new MyNode<>(56);

        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(threadNode);

        MyNode peak = myStack.peak();
        myStack.printStack();

        Assert.assertNotEquals(firstNode, peak );
    }
}

