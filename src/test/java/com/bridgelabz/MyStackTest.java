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

    @Test
    public void Provide3Number_WhenPop_shouldPoppedFromLast() {
        MyStack myStack = new MyStack();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        myStack.printStack();

        MyNode pop1 = myStack.pop();
        myStack.printStack();
        MyNode pop2 = myStack.pop();
        myStack.printStack();
        MyNode pop3 = myStack.pop();
        myStack.printStack();

        Assert.assertEquals(thirdNode, pop1);

        Assert.assertEquals(secondNode, pop2);

        Assert.assertEquals(firstNode, pop3);
    }

    @Test
    public void Provide3Number_whenAddedInSequence_TestCaseShouldPass()
    {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        MyNode peek = myQueue.peek();

        Assert.assertEquals(firstNode, peek);
    }
}

