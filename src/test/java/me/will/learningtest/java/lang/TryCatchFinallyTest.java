package me.will.learningtest.java.lang;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TryCatchFinallyTest {
    @Test(expected = Exception.class)
    public void testThrowExceptionInFinally() {
        try {
            System.out.println("in try {}...");
        } finally {
            doSomethingWithRuntimeException();
            fail("Not suppose to go here");
        }
    }

    private void doSomethingWithRuntimeException() {
        throw new RuntimeException("ExceptionFromFinally");
    }
}
