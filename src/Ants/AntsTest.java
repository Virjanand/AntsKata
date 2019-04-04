package Ants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntsTest {

    @Test
    void advanceAnts_A_B_1Step_returnsBA() {
        AntRows ants = new AntRows("A", "B");
        assertEquals("BA", ants.advance(1));
    }
}
