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

    @Test
    void advanceAnts_AB_C_2Steps_returnsCAB() {
        AntRows ants = new AntRows("AB", "C");
        assertEquals("CAB", ants.advance(2));
    }

    @Test
    void advanceAnts_AB_CD_2Steps_returnsCADB() {
        AntRows ants = new AntRows("AB", "CD");
        assertEquals("CADB", ants.advance(2));
    }

    @Test
    void advanceAnts_AB_CD_3Steps_returnsCDAB() {
        AntRows ants = new AntRows("AB", "CD");
        assertEquals("CDAB", ants.advance(3));
    }
}
