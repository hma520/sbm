package cn.hma.sbm;

import cn.hma.sbm.entity.User;
import cn.hma.sbm.service.UserService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmApplicationTests {

	@Autowired
	UserService userService;
	@Test
	public void contextLoads() {
		System.out.println(JSON.toJSONString(userService.selectById(1)));

	}

	@Test
	public void testInsert() {

		User user = new User();
		user.setName("maxj");
		user.setAge(20);
		userService.insert(user);
		System.out.println(JSON.toJSONString(userService.selectById(user.getId())));

	}

}
