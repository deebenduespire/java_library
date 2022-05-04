package org.espire.library.arrays.swappingarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwappingClassTest {

    @Test
    void swap() {
        int[] expected = new int[]{3,2,1};
        assertArrayEquals(expected,SwappingClass.swap(new int[]{1,2,3}));
    }
}