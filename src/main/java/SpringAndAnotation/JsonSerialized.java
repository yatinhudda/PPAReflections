package SpringAndAnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //this JsonSerialized annotation can be put on Class
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialized {
    public String key() default "";
}
