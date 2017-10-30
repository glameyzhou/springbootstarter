package org.glamey.springbootstart.controller;

import java.util.List;
import java.util.Random;
import javax.annotation.Resource;
import org.glamey.springbootstart.domain.User;
import org.glamey.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouyang.zhou. 2017.10.30.11.
 */
@RestController
@RequestMapping("user")
public class UserController {

  @Resource
  private UserService userService;

  @Value("${user.name}")
  private String name;


  @GetMapping
  public Object home() {
    List<User> users = userService.listUsers();
    for (User user : users) {
      user.setAge(new Random().nextInt(40));
    }
    System.out.println("user.name=" + name);
    return users;
  }
}
