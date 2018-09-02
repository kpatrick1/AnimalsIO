package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.Cat;
import us.kpatrick.Dog;
import us.kpatrick.Student;
import us.kpatrick.Talkable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest extends PetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void printOut() {
    }

    @Test
    void addCat() {
        Cat c = new Cat(4,"fluffy");
        assertNotNull(c);


    }

    @Test
    void addDog() {
        Dog d = new Dog(true,"Guthrie");
        assertNotNull(d);
    }

    @Test
    void addStudent() {
        Student s = new Student(21,"Kevin");
        assertNotNull(s);
    }
}