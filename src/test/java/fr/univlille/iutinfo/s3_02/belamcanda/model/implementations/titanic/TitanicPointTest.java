package fr.univlille.iutinfo.s3_02.belamcanda.model.implementations.titanic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitanicPointTest {
    @Test
    void the_name_of_label_is_correct(){
        TitanicPoint point1 = new TitanicPoint();
        point1.name = "banane";
        point1.pClass = 1;
        point1.age = 20.0;
        point1.fare = 100.0;
        String test = String.format("%s :\n\tClass : %d\n\tAge : %.2f\n\tFare : %.2f", point1.name, point1.pClass, point1.age, point1.fare);
        assertEquals(test, point1.toLabel());
    }

    @Test
    void the_to_string_is_correct(){
        TitanicPoint point1 = new TitanicPoint();
        point1.name = "Jean";
        assertEquals("Jean", point1.toString());
    }

    @Test
    void two_passengers_are_different() {
        TitanicPoint point1 = new TitanicPoint();
        TitanicPoint point2 = new TitanicPoint();
        point1.age = 20.;
        point2.age = 22.;

        assertNotEquals(point1, point2);
    }
}
