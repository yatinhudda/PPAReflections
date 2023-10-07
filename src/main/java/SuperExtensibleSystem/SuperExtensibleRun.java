package SuperExtensibleSystem;

import java.lang.reflect.InvocationTargetException;

public class SuperExtensibleRun {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        new Client().start(new Library());
    }
}
