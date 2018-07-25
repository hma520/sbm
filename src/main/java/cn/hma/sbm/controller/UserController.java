package cn.hma.sbm.controller;

import cn.hma.sbm.entity.User;
import cn.hma.sbm.service.UserService;
import cn.hma.sbm.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 增删改查 CRUD
     */
    @GetMapping("/test2")
    public User test2() {

        System.err.println("查询：" + userService.selectById(3).toString());

        return userService.selectById(1L);
    }

//    @Autowired
//    UserMapper userMapper;
//    @RequestMapping(value = "/listuser")
//    public String listuser(){
//
//   User u =  userMapper.selectById(1);
//        return u.getName();
//    }
//
//    @GetMapping("/add")
//    public String add() {
//        int result = 0;
//        User u = new User();
//        for (int i=0;i<20;i++) {
//        u.setName("小三"+ new Random().nextInt(100));
//        u.setAge(new Random().nextInt(50));
//
//        result = userMapper.insert(u);
//        }
//        return  "插入记录成功.......";
//    }
//    @GetMapping("/update")
//    public String update() {
//        User u =  userMapper.selectById(45);
//        u.setName("帝王");
//        u.setAge(100);
//        return userMapper.updateById(u) +"";
//    }
//
//    @GetMapping("/list")
//    public String list() {
//        List<User> userList = userMapper.selectList(
//                new EntityWrapper<User>().eq("name","小三35")
//        );
//        return JSON.toJSONString(userList);
//    }
//
//    @GetMapping("/page")
//    public String page() {
//        List<User> userList = userMapper.selectPage(
//                new Page<User>(1,10),
//                new EntityWrapper<User>().like("name","小三")
//
//        );
//        return JSON.toJSONString(userList);
//    }
}
