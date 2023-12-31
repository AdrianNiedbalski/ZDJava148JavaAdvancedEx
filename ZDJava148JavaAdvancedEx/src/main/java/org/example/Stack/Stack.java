package org.example.Stack;

import java.util.EmptyStackException;

interface Stack {
    void push(String item) throws FullStackException;
    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();
}

class FullStackException extends Exception {
    public FullStackException(String message) {
        super(message);
    }
}
}