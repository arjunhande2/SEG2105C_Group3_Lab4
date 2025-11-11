package com.example.mycalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathEvalTest {
    @Test
    public void Test1Add() {
        assertEquals("12",MathEval.eval("3+9"));
    }

    @Test
    public void Test2AddMult() {
        assertEquals("9",MathEval.eval("3+2*3"));
    }

    @Test
    public void Test3Div() {
        assertEquals("7",MathEval.eval("16/2-1"));
    }

    @Test
    public void Test4Brackets() {
        assertEquals("10",MathEval.eval("(2+3)*2"));
    }

    @Test
    public void Test5Error1() {
        assertEquals("Error",MathEval.eval("3*-"));
    }

    @Test
    public void Test6Error2() {
        assertEquals("Error",MathEval.eval(""));
    }

    @Test
    public void Test7Error3() {
        assertEquals("Error",MathEval.eval("(3+"));
    }

}