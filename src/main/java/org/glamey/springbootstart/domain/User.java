package org.glamey.springbootstart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The user domain Object
 *
 * @author zhouyang.zhou. 2017.10.30.11.
 */
@Data
@AllArgsConstructor
public class User implements java.io.Serializable {
  private String name;
  private String email;
  private String address;
  private int age;
}
