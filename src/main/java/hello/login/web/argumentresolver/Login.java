package hello.login.web.argumentresolver;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)  //어노테이션문법
@Retention(RetentionPolicy.RUNTIME) //실제동작할때까지 어노테이션이 남아있어야하기때문에 작성
public @interface Login {
}
