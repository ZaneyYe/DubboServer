import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yzy on 2016/8/31.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        System.out.println("准备：");
        System.in.read();
    }
}
