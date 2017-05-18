package junit.test;

import java.util.Date;

import org.junit.Test;

import cn.itcast.domain.User;
import cn.itcast.exception.UserExistException;
import cn.itcast.service.impl.BusinessServiceImpl;

//9
public class ServiceTest {
    @Test
    public void testRegister() {
        User user = new User();
        user.setBirthday(new Date());
        user.setEmail("aa@sina.com");
        user.setId("34343434");
        user.setNickname("李子");
        user.setPassword("123");
        user.setUsername("gggg");
        BusinessServiceImpl service = new BusinessServiceImpl();
        try {
            service.register(user);
            System.out.println("注册成功。");
        } catch (UserExistException e) {
            System.out.println("用户已存在。");
        }

    }

    @Test
    public void testLogin() {
        BusinessServiceImpl service = new BusinessServiceImpl();
        User user = service.login("gggg", "123");
        System.out.println(user);
    }
}
