import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ArchiverTest {

    @org.junit.jupiter.api.Test
    void convertSimpleToFrequencies(){
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        frequencies.put('p', 5);
        frequencies.put('d', 2);
        assertEquals(frequencies, Archiver.convertStringToFrequencies("pppppdd"));
    }

    @org.junit.jupiter.api.Test
    void convertSingleSpaceStringToFrequencies() {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        frequencies.put(' ', 1);
        assertEquals(frequencies, Archiver.convertStringToFrequencies(" "));
    }

    @org.junit.jupiter.api.Test
    void convertEmptyStringToFrequencies() {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        assertEquals(frequencies, Archiver.convertStringToFrequencies(""));
    }

    @org.junit.jupiter.api.Test
    void convertStringToFrequencies() {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        frequencies.put('H', 1);
        frequencies.put('e', 3);
        frequencies.put('l', 4);
        frequencies.put('o', 2);
        frequencies.put(' ', 5);
        frequencies.put('w', 1);
        frequencies.put('r', 1);
        frequencies.put('d', 1);
        frequencies.put('!', 1);
        frequencies.put('M', 1);
        frequencies.put('y', 1);
        frequencies.put('n', 2);
        frequencies.put('a', 2);
        frequencies.put('m', 3);
        frequencies.put('i', 2);
        frequencies.put('s', 1);
        frequencies.put('D', 1);
        frequencies.put('.', 1);
        assertEquals(frequencies, Archiver.convertStringToFrequencies("Hello world! My name is Daniel."));
    }

    @org.junit.jupiter.api.Test
    void compressString() {
        HashMap<Character, Boolean[]> table = new HashMap<Character, Boolean[]>();

        assertEquals(,Archiver.compressString("banana", table));
    }
}