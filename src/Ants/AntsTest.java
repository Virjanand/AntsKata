package Ants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntsTest {

    @Test
    void advanceAnts_A_B_1Step_returnsBA() {
        AntRows ants = new AntRows("A", "B");
        assertEquals("BA", ants.advance(1));
    }

    @Test
    void advanceAnts_AB_C_1Step_returnsACB() {
        AntRows ants = new AntRows("AB", "C");
        assertEquals("ACB", ants.advance(1));
    }
}
