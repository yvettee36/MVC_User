package junit.test;

import java.util.Date;

import org.junit.Test;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;

//4
public class UserDaoTest {
    @Test
    public void testAdd() {
        User user = new User();
        user.setBirthday(new Date());
        user.setEmail("aa@sina.com");
        user.setId("34343434");
        user.setNickname("李子");
        user.setPassword("123");
        user.setUsername("aaa");

        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }

    @Test
    public void testFind() {
        UserDao dao = new UserDaoImpl();
        User user = dao.find("aaa", "123");
        String aa = user.getEmail();
        if (aa.endsWith("kk")) {
            System.out.println("kkdf");
        }
    }

    @Test
    public void testFindByUsername() {
        UserDao dao = new UserDaoImpl();
        boolean b = dao.find("aaa");
    }
}
