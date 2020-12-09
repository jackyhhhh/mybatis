import com.tarena.dao.UserDao;
import com.tarena.dao.impl.UserDaoImpl;
import com.tarena.entity.User;

import java.util.List;

public class TestSelectUser {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.findById(7);
        System.out.println(user.getName()+": "+user.getSex());

        List<User> list = userDao.findAll();
        for(User u: list){
            System.out.println(u.getName()+": "+u.getSex());
        }
    }

}
