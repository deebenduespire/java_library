package org.espire.library.datastructures.arrays;

import org.espire.library.datastructures.arrays.CloneOfArray;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CloneOfArrayTest {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Test
    void cloneArray() {
        logger.info("Starting");
        int[] expected = new int[]{1,2,3};
        assertArrayEquals(expected, CloneOfArray.cloneArray(new int[]{1,2,3}));
        //assertTrue(expected.equals(new int[]{1,2,3}));
        logger.info("Ended here");
    }
}