import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {

    @Test
    public void PersonTest1(){
        Person p = new Person("John", "Smith", 32);
        assertEquals("John", p.getName());
        assertEquals("Smith", p.getSurname());
        assertEquals(32, p.getAge());
    }
}
