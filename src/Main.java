import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        getAnnotation();
    }

    public static void getAnnotation() {
        //GreetingService 클래스에 있는 모든 메소드들을 가져온다
        Method[] methos = GreetingService.class.getDeclaredMethods();
        for (Method method : methos) {
            //가져온 메소드에 어노테이션이 적용되어 있다면
            if(method.isAnnotationPresent(GreetingAnnotation.class)) {
                //GreetingAnnotation 객체를 얻는다.
                GreetingAnnotation greetingAnnotation = method.getAnnotation(GreetingAnnotation.class);
                System.out.print(greetingAnnotation.greeting());
                try {
                    method.invoke(new GreetingService());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
