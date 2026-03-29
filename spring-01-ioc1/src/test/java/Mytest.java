import com.example.dao.UserDaoMySQLImpl;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoMySQLImpl());
        userService.getUser();
    }
}
