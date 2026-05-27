package Tamgiac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangle {

    @Test
    void TC01() {
        assertEquals("Invalid Input", Triangle.checkTriangle(0, 5, 5));
    }

    @Test
    void TC02() {
        assertEquals("Invalid Input", Triangle.checkTriangle(101, 5, 5));
    }

    @Test
    void TC03() {
        assertEquals("Invalid Input", Triangle.checkTriangle(-1, 5, 5));
    }

    @Test
    void TC04() {
        assertEquals("Not a Triangle", Triangle.checkTriangle(1, 2, 3));
    }

    @Test
    void TC05() {
        assertEquals("Equilateral", Triangle.checkTriangle(5, 5, 5));
    }

    @Test
    void TC06() {
        assertEquals("Isosceles", Triangle.checkTriangle(5, 5, 3));
    }

    @Test
    void TC07() {
        assertEquals("Scalene", Triangle.checkTriangle(4, 5, 6));
    }
}