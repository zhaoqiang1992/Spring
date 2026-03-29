import com.example.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        user.show();

        User user1 = context.getBean("user3", User.class);
        user1.show();

    }
}
