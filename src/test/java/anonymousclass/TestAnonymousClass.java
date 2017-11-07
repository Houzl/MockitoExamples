package anonymousclass;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertEquals;

public class TestAnonymousClass {
    @Test
    public void testAnonymousClassInMethodA() throws Exception {
        // Whitebox is our friend!

        // Get Class of first anonymous inner class.
        Class<?> klass = Whitebox.getAnonymousInnerClassType(AnonymousClass.class, 1);
        // Get a new instance of the first anonymous inner class.
        Object anonymousClass = Whitebox.newInstance(klass);
        // Using Whitebox invoke methods.
        assertEquals("Implement in AnonymousClass.methodA", Whitebox.invokeMethod(anonymousClass, "abstractMethod"));
        assertEquals("Overrided in AnonymousClass.methodA", Whitebox.invokeMethod(anonymousClass, "concrateMethod"));
    }
}
