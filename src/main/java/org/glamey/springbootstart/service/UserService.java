package org.glamey.springbootstart.service;

import com.google.common.collect.Lists;
import java.util.List;
import org.glamey.springbootstart.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author zhouyang.zhou. 2017.10.30.11.
 */
@Service
public class UserService {

  public List<User> listUsers() {
    return Lists.newArrayList(
        new User("glamey", "glamey@glamey.org", "beijing", 30),
        new User("zhangsan", "zhangsan@glamey.org", "beijing", 30),
        new User("lisi", "lisi@glamey.org", "beijing", 30)
    );
  }
}
