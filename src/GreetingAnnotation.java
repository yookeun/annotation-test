import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yookeun on 2017. 1. 13..
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GreetingAnnotation {
    String value() default "ko";
    String greeting() default "안녕하세요.";
}
