package us.kpatrick.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.kpatrick.Cat;
import us.kpatrick.Dog;
import us.kpatrick.Student;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalsIOTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addCat() {
        Cat c = new Cat(4,"fluffy");
        assertNotNull(c);
    }

    @Test
    public void addDog() {
        Dog d = new Dog(true,"Guthrie");
        assertNotNull(d);
    }

    @Test
    public void addStudent() {
        Student s = new Student(21,"Kevin");
        assertNotNull(s);
    }
}