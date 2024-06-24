/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 04 - ArrayListTest
 */

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void testContainsInteger() {
        ArrayList<Integer> al = new ArrayList<>();
        assertFalse(al.contains(5));
        al.append(4);
        al.append(10);
        al.append(5);
        assertTrue(al.contains(4));
        assertTrue(al.contains(10));
        assertTrue(al.contains(5));
        assertFalse(al.contains(2));
        al.append(2);
        assertTrue(al.contains(2));
    }

    @Test
    public void testContainsString() {
        ArrayList<String> al = new ArrayList<>();
        assertFalse(al.contains("bla"));
        al.append("bla");
        al.append("ble");
        al.append("bli");
        assertTrue(al.contains("bla"));
        assertTrue(al.contains("ble"));
        assertTrue(al.contains("bli"));
        assertFalse(al.contains("blo"));
        al.append("blo");
        assertTrue(al.contains("blo"));
    }

    @Test
    public void testReverseInteger() {
        ArrayList<Integer> al = new ArrayList<>();
        al.reverse();
        assertEquals("[]", al.toString());
        al.append(4);
        al.append(10);
        al.append(5);
        assertEquals("[4 10 5]", al.toString());
        al.reverse();
        assertEquals("[5 10 4]", al.toString());
        al.append(8);
        assertEquals("[5 10 4 8]", al.toString());
        al.reverse();
        assertEquals("[8 4 10 5]", al.toString());
    }

    @Test
    public void testReverseString() {
        ArrayList<String> al = new ArrayList<>();
        al.reverse();
        assertEquals("[]", al.toString());
        al.append("bla");
        al.append("ble");
        al.append("bli");
        assertEquals("[bla ble bli]", al.toString());
        al.reverse();
        assertEquals("[bli ble bla]", al.toString());
        al.append("blo");
        assertEquals("[bli ble bla blo]", al.toString());
        al.reverse();
        assertEquals("[blo bla ble bli]", al.toString());
    }

    @Test
    public void testClearInteger() {
        ArrayList<Integer> al = new ArrayList<>();
        al.clear();
        assertEquals("[]", al.toString());
        al.append(4);
        al.append(10);
        al.append(5);
        assertEquals("[4 10 5]", al.toString());
        al.clear();
        assertEquals("[]", al.toString());
        al.append(8);
        assertEquals("[8]", al.toString());
        al.clear();
        assertEquals("[]", al.toString());
    }

    @Test
    public void testClearString() {
        ArrayList<String> al = new ArrayList<>();
        al.clear();
        assertEquals("[]", al.toString());
        al.append("bla");
        al.append("ble");
        al.append("bli");
        assertEquals("[bla ble bli]", al.toString());
        al.clear();
        assertEquals("[]", al.toString());
        al.append("blo");
        assertEquals("[blo]", al.toString());
        al.clear();
        assertEquals("[]", al.toString());
    }
}