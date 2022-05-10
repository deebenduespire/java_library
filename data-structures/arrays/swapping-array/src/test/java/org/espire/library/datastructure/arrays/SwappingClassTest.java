package org.espire.library.datastructure.arrays;

import org.espire.library.datastructures.arrays.SwappingClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SwappingClassTest {

    @Test
    void swap() {
        int[] expected = new int[]{3,2,1};
        assertArrayEquals(expected, SwappingClass.swap(new int[]{1,2,3}));
    }
}