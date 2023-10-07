package SuperExtensibleSystem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public void start(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = o.getClass();
        Method m = c.getMethod("process", String.class);
        m.invoke(o, "101");
    }
}
