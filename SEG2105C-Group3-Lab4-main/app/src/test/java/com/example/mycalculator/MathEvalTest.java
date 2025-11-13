package com.example.mycalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathEvalTest {
    @Test
    public void test1Add() {
        assertEquals("12",MathEval.eval("3+9"));
    }

    @Test
    public void test2AddMult() {
        assertEquals("9",MathEval.eval("3+2*3"));
    }

    @Test
    public void test3Div() {
        assertEquals("7",MathEval.eval("16/2-1"));
    }

    @Test
    public void test4Brackets() {
        assertEquals("10",MathEval.eval("(2+3)*2"));
    }

    @Test
    public void test5Error1() {
        assertEquals("Error",MathEval.eval("3*-"));
    }

    @Test
    public void test6Error2() {
        assertEquals("Error",MathEval.eval(""));
    }

    @Test
    public void test7Error3() {
        assertEquals("Error",MathEval.eval("(3+"));
    }

    @Test
    public void dedicatedFailTest() {
        assertEquals("1",MathEval.eval("1+1"));
    }
}