package Nganhang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {

    @Test
    void TC01() {
        assertEquals("Invalid Input", Bank.checkBank(17, 250.0, 600, 'C'));
    }

    @Test
    void TC02() {
        assertEquals("Invalid Input", Bank.checkBank(30, 4.9, 600, 'C'));
    }

    @Test
    void TC03() {
        assertEquals("Invalid Input", Bank.checkBank(30, 250.0, 299, 'C'));
    }

    @Test
    void TC04() {
        assertEquals("Invalid Input", Bank.checkBank(30, 250.0, 600, 'X'));
    }

    @Test
    void TC05() {
        assertEquals("REJECT", Bank.checkBank(30, 250.0, 400, 'C'));
    }

    @Test
    void TC06() {
        assertEquals("REJECT", Bank.checkBank(30, 10.0, 600, 'C'));
    }

    @Test
    void TC07() {
        assertEquals("MANUAL REVIEW", Bank.checkBank(30, 10.0, 750, 'C'));
    }

    @Test
    void TC08() {
        assertEquals("REJECT", Bank.checkBank(30, 10.0, 750, 'F'));
    }

    @Test
    void TC09() {
        assertEquals("APPROVE", Bank.checkBank(30, 20.0, 650, 'C'));
    }

    @Test
    void TC10() {
        assertEquals("APPROVE", Bank.checkBank(30, 20.0, 800, 'C'));
    }

    @Test
    void TC11() {
        assertEquals("MANUAL REVIEW", Bank.checkBank(30, 20.0, 650, 'F'));
    }

    @Test
    void TC12() {
        assertEquals("MANUAL REVIEW", Bank.checkBank(30, 20.0, 800, 'F'));
    }
}