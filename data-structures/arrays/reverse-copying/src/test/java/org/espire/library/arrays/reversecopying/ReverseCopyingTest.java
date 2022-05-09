package org.espire.library.arrays.reversecopying;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseCopyingTest {

    @Test
    void reverse() {
        int[] expected = new int[]{4,3,2,1};
        assertArrayEquals(expected,new ReverseCopying().reverse(new int[]{1,2,3,4}));
    }
}