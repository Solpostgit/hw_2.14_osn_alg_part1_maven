package ru.skypro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.skypro.TestConstants.ITEM_LAST_5;

public class StringListImplTest {

    private StringList list = new StringListImpl();

    private void setStringList() {
        list.add("0", "1", "2", "3", "4", "5", "6", "7");
    }

    @Test
    void constructorWithNegativeCapacityExceptionTest() {
        assertThrows(IllegalCapacityException.class, () -> new StringListImpl(-1));
        assertThrows(IllegalCapacityException.class, () -> new StringListImpl(0));
    }

    @Test
    @BeforeEach
    void clearMethodShouldMakeStringListEmpty() {
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void addMethodShouldAddStringToStringListAndReturnAddedString() {
        String expected = "первый";
        assertEquals(expected, list.add("первый"));
        expected = "второй";
        assertEquals(expected, list.add("второй"));
        expected = "[первый, второй]";
        assertEquals(expected, list.toString());
    }

    @Test
    void addMethodShouldThrowExceptionWhenReceivesNullAsArgument() {
        String s = null;
        assertThrows(NothingToAddException.class, () -> list.add(s));
    }

    @Test
    void addMethodShouldThrowExceptionWhenNoArgumentsArePassed() {
        assertThrows(NothingToAddException.class, () -> list.add());
    }

    @Test
    void addMethodShouldThrowExceptionWhenTooManyStringsArePassed() {
        setStringList();
        assertThrows(InsufficientCapacityException.class, () -> list.add("8", "9", "10"));
    }

}

