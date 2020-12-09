import com.tarena.dao.impl.UserDaoImpl;

public class TestDeleteUserById {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.deleteUserById(4);
    }
}
