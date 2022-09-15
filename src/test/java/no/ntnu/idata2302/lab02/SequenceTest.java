/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;


import static org.junit.Assert.*;
import org.junit.Test;


public class SequenceTest
{
    @Test
    public void overFlow() {
        var sequence = new Sequence();
        sequence.insert(1);
        sequence.insert(1);
        sequence.insert(1);
        sequence.insert(1);
        sequence.insert(1);
        assertEquals(5, sequence.getLength());
    }
    @Test
    public void overFlowLookup() {
        var sequence = new Sequence();
        sequence.insert(1);
        sequence.insert(1);
        sequence.insert(1);
        sequence.insert(5);
        sequence.insert(1);
        assertEquals(5, sequence.lookup(5));
    }


    @Test
    public void testLookup() {
        var sequence = new Sequence();
        sequence.insert(1);
        sequence.insert(5);
        sequence.insert(8);
        assertEquals(8, sequence.lookup(8));
    }

    @Test
    public void testInsert() {
        var sequence = new Sequence();
        sequence.insert(8);
        assertEquals(8, sequence.lookup(8));
    }

    @Test
    public void testDelete() {
        var sequence = new Sequence();
        sequence.insert(8);
        sequence.insert(2);
        sequence.delete();
        assertEquals(1, sequence.getLength());
    }

    @Test
    public void emptySequenceHasLengthZero() {
        var sequence = new Sequence();
        assertEquals(0, sequence.getLength());
    }

}
