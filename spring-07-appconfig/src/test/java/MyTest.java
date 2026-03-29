import com.example.User;
import com.example.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        User user = context.getBean("getUser",User.class);
        System.out.println(user.getName());

    }
}
