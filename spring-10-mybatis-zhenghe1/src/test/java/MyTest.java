import com.example.mapper.UserMapper;
import com.example.mapper.UserMapperImpl;
import com.example.mapper.UserMapperImpl2;
import com.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.selectUser();
        users.forEach(System.out::println);

        System.out.println("=====================================");
        UserMapperImpl2 userMapper2 = context.getBean("userMapper2", UserMapperImpl2.class);
        List<User> users2 = userMapper2.selectUser();
        users2.forEach(System.out::println);
    }
}
