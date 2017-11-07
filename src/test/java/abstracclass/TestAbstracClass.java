package abstracclass;

import org.junit.Test;
import abstracclass.AbstracClass;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;

public class TestAbstracClass {
    @Test
    public void testConcrateMethod() {
        // Step 1, Mock AbstracClass
        AbstracClass abstracClass = mock(AbstracClass.class);
        // Setp 2, Setup call real method when concrate method is called.
        doCallRealMethod().when(abstracClass).concrateMethod();
        assertEquals("Concrate method in AbstracClass is called", abstracClass.concrateMethod());
    }
}
