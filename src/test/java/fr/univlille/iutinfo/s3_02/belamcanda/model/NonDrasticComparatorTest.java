package fr.univlille.iutinfo.s3_02.belamcanda.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonDrasticComparatorTest {
    @Test
    public void comparaison_between_same_values_is_equal_to_0() {
        assertEquals(0, new NonDrasticComparator().compare(5, 5));
    }

    @Test
    public void comparaison_between_different_values_is_equal_to_the_difference_of_the_two_values() {
        assertEquals(3, new NonDrasticComparator().compare(6, 3));
    }

    @Test
    public void comparaison_between_different_values_can_be_negative() {
        assertEquals(-3, new NonDrasticComparator().compare(6, 9));
    }
}