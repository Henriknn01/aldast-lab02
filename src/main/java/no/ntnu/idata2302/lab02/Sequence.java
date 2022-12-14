/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;


import java.io.ObjectStreamException;
import java.util.Arrays;

public class  Sequence {

    private int capacity;
    private int length;
    private int[] array;

    public Sequence() {
        this.capacity = 100;
        this.length = 0;
        array = new int[capacity];
    }


    public int getLength() {
        return this.length;
    }

    public void insert(int item) {
        if (this.array.length+1 > this.capacity) {
            this.capacity *= 2;
            int[] tmpArray = this.array;
            this.array = Arrays.copyOf(tmpArray, this.capacity);
        }
        this.array[this.getLength()] = item;
        this.length++;
    }

    public void delete() {
        if (getLength() > 0) {
            this.length -= 1;
        }
    }

    public int lookup(int item) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < this.getLength(); i++) {
            if (this.array[i] == item) {
                return item;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Could not find any matching items in array");
    }
}
