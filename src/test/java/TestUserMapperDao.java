import com.tarena.dao.UserMapperDao;
import com.tarena.entity.User;
import com.tarena.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestUserMapperDao {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSession();
        UserMapperDao userMapperDao = session.getMapper(UserMapperDao.class);
        User user = userMapperDao.findById(7);
        System.out.println(user.getId()+"  "+user.getName());

        List<User> list = userMapperDao.findAll();
        for(User u : list){
            System.out.println(u.getId()+"  "+u.getName());
        }
    }
}
