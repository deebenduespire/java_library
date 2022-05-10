package org.espire.library.datastructure.arrays;

import org.espire.library.datastructures.arrays.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void leftRotate() {
        int[] expected = new int[]{3,4,5,6,7,1,2};

        assertArrayEquals(expected,new Array().leftRotate(new int[]{1,2,3,4,5,6,7},2));
    }
}