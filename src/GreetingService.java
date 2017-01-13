/**
 * Created by yookeun on 2017. 1. 13..
 */
public class GreetingService {

    @GreetingAnnotation()
    public void sayHelloKorean() {
        System.out.println("홍길동");
    }

    @GreetingAnnotation(value = "en", greeting = "Hello. ")
    public void sayHelloEnglish() {
        System.out.println("홍길동");
    }
}
