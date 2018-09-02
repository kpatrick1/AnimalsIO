package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.FileInput;

import static org.junit.jupiter.api.Assertions.*;

class FileInputTest extends PetTest {
    FileInput indata;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fileReadLine() {
        FileInput indata = new FileInput("animals.txt");
        String line;
        line = indata.fileReadLine();
        assertTrue(line instanceof String);

        FileInput err = new FileInput("animals1.txt");
        String line1;
        line1 = err.fileReadLine();
        assertFalse(line1 instanceof String);

    }

}