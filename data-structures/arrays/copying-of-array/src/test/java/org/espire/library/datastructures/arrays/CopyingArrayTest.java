package org.espire.library.datastructures.arrays;

import org.espire.library.datastructures.arrays.CopyingArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyingArrayTest {

    @Test
    void copying() {
        int expected[] = new int[]{1,2,3,4,5,6};
        assertArrayEquals(expected, CopyingArray.copying(new int[]{1,2,3,4,5,6},new int[6]));
    }
}