import com.tarena.dao.impl.UserDaoImpl;
import com.tarena.entity.User;

public class TestUpdateUser {
    public static void main(String[] args) {
        User user = new User();
        user.setId(5);
        user.setName("Mybatis");
        user.setSex("Female");
        user.setSalary(5000.0);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.updateUser(user);
    }
}
