package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void add() {
    // GIVEN: Zwei Zahlen 2 und 3
    // WHEN: Wir sie addieren
    // THEN: Das Ergebnis sollte 5 sein
    assertEquals(5, Main.add(2, 3));
    // GIVEN: Zwei Zahlen -1 und 1
    // WHEN: Wir sie addieren
    // THEN: Das Ergebnis sollte 0 sein
    assertEquals(0, Main.add(-1, 1));
    }
    @Test
    void isEven() {
    // GIVEN: Die Zahl 4
    // WHEN: Wir prüfen, ob sie gerade ist
    // THEN: Das Ergebnis sollte true sein
    assertTrue(Main.isEven(4));
    // GIVEN: Die Zahl 5
    // WHEN: Wir prüfen, ob sie gerade ist
    // THEN: Das Ergebnis sollte false sein
    assertFalse(Main.isEven(5));
    }
    @Test
    void multiply() {
    // GIVEN: Zwei Zahlen 3 und 4
    // WHEN: Wir sie multiplizieren
    // THEN: Das Ergebnis sollte 12 sein
    assertEquals(12, Main.multiply(3, 4));
    // GIVEN: Eine Zahl ist 0
    // WHEN: Wir sie mit 5 multiplizieren
    // THEN: Das Ergebnis sollte 0 sein
    assertEquals(0, Main.multiply(0, 5));
    }

    @Test
    void toUpperCase() {
    // GIVEN: String "hallo"
    // WHEN: Wir ihn in Großbuchstaben umwandeln
    // THEN: Sollte das Ergebnis "HALLO" sein
    assertEquals("HELLO", Main.toUpperCase("hello"));
    // GIVEN: Der String "Java"
    // WHEN: Wir ihn in Großbuchstaben umwandeln
    // THEN: Das Ergebnis sollte "JAVA" sein
    assertEquals("JAVA", Main.toUpperCase("Java"));
    }
    @Test
    void isPositive() {
    // GIVEN: Die Zahl "4"
    // WHEN: Wir prüfen, ob sie Positiv ist
    // THEN: Das Ergebnis sollte "true" sein
    assertTrue(Main.isPositive(4));
    // GIVEN: Die Zahl -3
    // WHEN: Wir prüfen, ob sie positiv ist
    // THEN: Das Ergebnis sollte false sein
    assertFalse(Main.isPositive(-4));
    // GIVEN: Die Zahl 0
    // WHEN: Wir prüfen, ob sie positiv ist
    // THEN: Das Ergebnis sollte false sein (0 ist nicht größer als 0)
    assertFalse(Main.isPositive(0));
    }
}