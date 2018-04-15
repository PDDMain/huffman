import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ArchiverTest {

    @org.junit.jupiter.api.Test
    void convertStringToFrequencies() {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        frequencies.put('p', 5);
        frequencies.put('d', 2);
        assertEquals(frequencies, Archiver.convertStringToFrequencies("pppppdd"));
    }
}