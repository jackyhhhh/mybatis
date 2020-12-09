import com.tarena.dao.UserMapperDao;
import com.tarena.entity.Page;
import com.tarena.entity.User;
import com.tarena.util.SqlSessionUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestPage {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSession();
        UserMapperDao userMapperDao = session.getMapper(UserMapperDao.class);
        List<User> list = userMapperDao.findPage(new Page(2, 2));
        for(User u : list){
            System.out.println(u.getId()+"  "+u.getName());
        }
    }
}
