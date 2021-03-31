import org.junit.Before;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestClassTest {
 
    private TestClass classUnderTest = new TestClass();
     
 
    @Before
    public void setup() {
        classUnderTest = new TestClass();
        System.out.println("Start Tests");
    }
 
    @Test
    public void test_doubleANumber() {
        assertEquals(6, classUnderTest.doubleNumber(3));
    }
 
    @Ignore
    public void test_not_executed() {
        fail("It should not executed");
    }
 
    @Test
    public void test_returnBoolean_false() {
        boolean shouldReturnFalse = classUnderTest.returnBoolean("NA");
        assertFalse(shouldReturnFalse);
    }
 
    @Test
    public void test_returnBoolean_true() {
        boolean shouldReturnTrue = classUnderTest.returnBoolean("Save");
        assertTrue(shouldReturnTrue);
    }
 
    @Test
    public void test_voidFoo() throws IllegalAccessException {
        try {
            classUnderTest.voidFunction("OK");
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void test_voidFoo_exception() throws IllegalAccessException {
        classUnderTest.voidFunction("NA");
    }
     
    @Test(timeout = 1)
    public void test_timeout() {
        classUnderTest.doubleNumber(9999);
    }
}
