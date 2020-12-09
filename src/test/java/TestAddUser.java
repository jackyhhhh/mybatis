import com.tarena.dao.impl.UserDaoImpl;
import com.tarena.entity.User;

public class TestAddUser {
    public static void main(String[] args) {
        User user = new User();
        user.setName("rose");
        user.setSex("female");
        user.setSalary(1000.0);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.addUser(user);
    }
}
